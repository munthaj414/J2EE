package com.sathya.product;

import java.util.List;

class ProductMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ProductDao dao=new ProductDao();
	int createResult=dao.creatProducttable();
	System.out.println("table creation status...."+createResult);

	}
}
 class ProductMain2{
	public static void main(String[]args)
	{
		//data insertion
		ProductDao dao=new ProductDao();
		Product product1=new Product();
		product1.setProId("PD2450");
		product1.setProName("sugar");
		product1.setProPrice(234.5);
		int result=dao.saveProduct(product1);
		if(result==1) 
		{
		System.out.println("data inserted successfully.."+result);
		}else
		{
			System.out.println("data inserted fail check once.."+result);
		}
		
	}
}
 class ProductMain3{
	 public static void main(String[]args)
	 {
		 ProductDao dao=new ProductDao();
		 Product product=dao.findById("PD123");
		 if(product!=null)
		 {
			 System.out.println("product available..");
			 System.out.println(product.getProId()+" "+product.getProName()+" "+product.getProPrice());
		 }else
		 {
			 System.out.println("product available..");
		 }
	 
	 }
 }
 class ProductMain4{
	 public static void main(String[]args)
	 {
		 ProductDao dao=new ProductDao();
	 List<Product>products=dao.findAll();
	 products.forEach(Product->System.out.println(Product));
	 }
	 
 }
 class ProductMain5 {
		public static void main(String[] args) { 
			ProductDao dao = new ProductDao();
			int count = dao.updateProduct(200, 5);
			System.out.println("updated records count.."+count);
		}
	}
 class ProductMain6 {
		public static void main(String[] args) { 
			ProductDao dao = new ProductDao();
			int count = dao.deleteProductById("PD2450");
			System.out.println("deleate records count.."+count);
		}
	}
 class ProductMain7 {
		public static void main(String[] args) { 
			ProductDao dao = new ProductDao();
			int count = dao.deleteProductByPrice(200);
			System.out.println("deleate records count.."+count);
		}
	}
 class ProductMain8 {
		public static void main(String[] args) { 
	
		ProductDao dao = new ProductDao();
			int count = dao.droptable();
			System.out.println("Table is dropped status...."+count);
		
 }
 }
 
 
