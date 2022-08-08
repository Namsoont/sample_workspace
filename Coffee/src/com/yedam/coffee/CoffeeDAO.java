package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {

	private static CoffeeDAO coffeeDao = null;

	private CoffeeDAO() {

	}

	public static CoffeeDAO getInstance() {
		return coffeeDao == null ? coffeeDao = new CoffeeDAO() : coffeeDao;

	}

	// 2-1 메뉴 조회
	public List<Coffee> getCoffee() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select coffee_menu, coffee_price from coffee";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setcoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(coffee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 2-2 상세 조회
	public List<Coffee> getDetailCoffee() {
		List<Coffee> list = new ArrayList<>();
		Coffee coffee = null;
		try {
			conn();
			String sql = "select * from coffee";
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				coffee = new Coffee();
				coffee.setcoffeeMenu(rs.getString("coffee_menu"));
				coffee.setCoffeePrice(rs.getInt("coffee_price"));
				coffee.setcoffeeSales(rs.getInt("coffee_sales"));
				coffee.setCoffeeExplain(rs.getString("coffee_explain"));
				list.add(coffee);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 2-3 메뉴 등록
	public int insertCoffee(Coffee coffee) {
		int result = 0;
		try {
			conn();
			String sql = "insert into coffee (coffee_menu,coffee_price,coffee_explain) values (?,?,?)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, coffee.getcoffeeMenu());
			pstmt.setInt(2, coffee.getCoffeePrice());
			pstmt.setString(3, coffee.getCoffeeExplain());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	// 2-4 판매
	public int getSalesCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "update coffee set coffee_Sales = coffee_sales+1 where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);
			result = pstmt.executeUpdate();

		} catch (

		Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;

	}

	// 2-5 메뉴 삭제
	public int deleteCoffee(String coffeeMenu) {
		int result = 0;
		try {
			conn();
			String sql = "delete from coffee where coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, coffeeMenu);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
}
