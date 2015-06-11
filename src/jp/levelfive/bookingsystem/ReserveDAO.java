package jp.levelfive.bookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReserveDAO {

	//予約の空きを検索する
	public static ResultSet SearchDate(int date) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			// データベースの指定
			String url = "jdbc:postgresql://localhost/booking";
			// データベースとの接続
			connection = DriverManager.getConnection(url, "levelfive",
					"levelfive");
			// ステートメントの取得
			statement = connection.createStatement();
			// SQL文の実行
			String sql = "select starttime, endtime, roomnumber from reserve where date=?";
			resultset = statement.executeQuery(sql);
			// 結果の取得と処理
			while (resultset.next()) {
				return resultset;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//予約の詳細を取得する
	public static ResultSet SearchDetails(int date) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		try {
			String url = "jdbc:postgresql://localhost/booking";
			connection = DriverManager.getConnection(url, "levelfive",
					"levelfive");
			statement = connection.createStatement();

			String sql = "select * from reserve where date=?";
			resultset = statement.executeQuery(sql);

			while (resultset.next()) {
				return resultset;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}




	//予約のデータを挿入する
	public static int Reserve(int date, int starttime, int endtime, int roomnumber, int password,int name, long title) {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultset = null;
		int flag = 0;
		try {String url = "jdbc:postgresql://localhost/booking";
			connection = DriverManager.getConnection(url, "levelfive",
					"levelfive");
			statement = connection.createStatement();
			String sql = "select max(id) from reserve";
			resultset = statement.executeQuery(sql);
			int i = statement.executeUpdate(sql);

			sql = "insert into reserve values (" + i + ", ?, ?, ?, ?, ?, ?, ?)";
			flag = statement.executeUpdate(sql);
			return flag;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				resultset.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				}
		}
	}

//予約を削除する
	public static int DeleteReserve(int id){
		Connection connection = null;
		Statement statement = null;
		int flag = 0;
		try {String url = "jdbc:postgresql://localhost/booking";
			connection = DriverManager.getConnection(url, "levelfive",
					"levelfive");
			statement = connection.createStatement();

			String sql = "delete from reserve where id = ?";
			flag = statement.executeUpdate(sql);
				return flag;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}


}


