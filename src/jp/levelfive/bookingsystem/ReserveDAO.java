package jp.levelfive.bookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReserveDAO {

	public static int SearchDate(int date) {
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
			// 予約の空きを検索する
			String sql = "select starttime, endtime, roomnumber from reserve where date=?";
			resultset = statement.executeQuery(sql);
			// 結果の取得と処理
			while (resultset.next()) {
				return;
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
	
	public static String Reserve(int date, int starttime, int endtime, int roomnumber, int password,int name, long title) {
		Connection connection = null;
		Statement statement = null;
		int flag = 0;
		
		try {String url = "jdbc:postgresql://localhost/booking";
			connection = DriverManager.getConnection(url, "levelfive",
					"levelfive");
			statement = connection.createStatement();
			String sql = "select max(id) from reserve";
			int i = statement.executeQuery(sql);
			// 予約データをテーブルに挿入する
			String sql = "insert into reserve values (" + i + ", ?, ?, ?, ?, ?, ?, ?)";
			flag = statement.executeUpdate(sql);
			return flag;
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
