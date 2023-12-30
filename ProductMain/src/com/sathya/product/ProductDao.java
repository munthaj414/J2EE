package com.sathya.product;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
public int creatProducttable()
{
	Connection connection=null;
	Statement statement=null;
	int result=0;
	try
	{
	connection=DataBaseConnectionUtils.createConnection();
	statement=connection.createStatement();
	result=statement.executeUpdate
			("create table product_info(proId varchar2(30) primary key,proName varchar2(20),proPrice number)");
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	finally {
		try {
			if(connection!=null)connection.close();
			if(statement!=null)statement.close();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	return result;
}
public int saveProduct(Product p) {
	int result=0;
	try (Connection connection=DataBaseConnectionUtils.createConnection())
	{
		//create the ps object
		PreparedStatement preparedStatement=connection.prepareStatement("insert into product_info values(?,?,?)" );
				
		
		//set the data ts params
		preparedStatement.setString(1,p.getProId());
		preparedStatement.setString(2,p.getProName());
		preparedStatement.setDouble(3,p.getProPrice());
		//execute the query
		result=preparedStatement.executeUpdate();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	 return result;
}
public Product findById(String proId)
{
	Product p=null;
	try 
	(Connection connection=DataBaseConnectionUtils.createConnection()){
		//create the ps object
		PreparedStatement preparedStatement=connection.prepareStatement
				("select * from product_info where proId=?");
		//set the data to params
		preparedStatement.setString(1, proId);
		//execute the query
		ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			//read the data from ResultSet & setting product
			p=new Product();
			p.setProId(resultSet.getString(1));
			p.setProName(resultSet.getString(2));
			p.setProPrice(resultSet.getDouble(3));
		}
		
	
		
	} catch (SQLException e) {
		// TODO: handle exception
		
		e.printStackTrace();
	}
	return p;
}
public List<Product>findAll()
{
 List<Product>products=new ArrayList<Product>();
{
Product p=null;

try (Connection connection=DataBaseConnectionUtils.createConnection())
{
Statement statement=connection.createStatement();
ResultSet resultSet=statement.executeQuery("select * from product__info");

while(resultSet.next())
{
	//read the data from Resultset & setting to product
	p=new Product();
	p.setProId(resultSet.getString(1));
	p.setProName(resultSet.getString(2));
	p.setProName(resultSet.getString(2));
	//ading the product into List.
	products.add(p);
}
}
catch(SQLException e){
	e.printStackTrace();
}

return products;

} 
}
public int updateProduct(double price,double incValue)
{	int result = 0;
	try(Connection connection = DataBaseConnectionUtils.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement("update product_info set proPrice=proPrice+? where proPrice>?");
		//set the data to params 
		preparedStatement.setDouble(1, incValue);
		preparedStatement.setDouble(2, price);
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
}

public int deleteProductById(String proId)
{	int result = 0;
try(Connection connection = DataBaseConnectionUtils.createConnection())
{	//create the PS object
	PreparedStatement preparedStatement = connection.prepareStatement("delete from product_info  where proId=?");
	//set the data to params 
	preparedStatement.setString(1,proId );
	
	//execute the query 
	result =  preparedStatement.executeUpdate();
}
catch(SQLException e)
{	e.printStackTrace();
}
return result;
}
public int deleteProductByPrice(double proPrice)
{	int result = 0;
try(Connection connection = DataBaseConnectionUtils.createConnection())
{	//create the PS object
	PreparedStatement preparedStatement = connection.prepareStatement
			("delete from product_info where proPrice>=?");
	//set the data to params 
	preparedStatement.setDouble(1,200);
	//execute the query 
	result =  preparedStatement.executeUpdate();
}
catch(SQLException e)
{	e.printStackTrace();
}
return result;
}
public int droptable()
{	int result=0;
	try(Connection connection=DataBaseConnectionUtils.createConnection())
	{
		//create the statement object
		Statement statement = connection.createStatement();
		//execute the query
		result = statement.executeUpdate("drop table Product_info");
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
}
}



