package org.startsteps.week13;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection()) {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products");
            while (rs.next()) {
                Product product = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public Product getProduct(int id) {
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM products WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("category"),
                        rs.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addProduct(Product product) {
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO products (name, category, price) VALUES (?, ?, ?)");
            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setDouble(3, product.getPrice());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProduct(int id, Product product) {
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("UPDATE products SET name = ?, category = ?, price = ? WHERE id = ?");
            ps.setString(1, product.getName());
            ps.setString(2, product.getCategory());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try (Connection connection = DBConnection.getConnection()) {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM products WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
