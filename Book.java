class Author
{
private String name,email;
private char gender;
Author()
{
   name="Three Pieces";
email="tommy@gmail.com";
gender='M';
}
String getname()
{
  return name;
}
String getemail()
{
  return email;
}
char getgender()
{
  return gender;
}


}

class Book
{
  private String name;
private String author;
private double price;
private int qtyInStock;
Book()
{
  name="Rosan";
author="dma";
price=34.5;
qtyInStock=90;
}

String getName()
{
return name;}
String getAuthor()
{
return author;}
double getPrice()
{ return price;}
int getQtyInStock()
{  return qtyInStock;}
void setPrice(double price)
{   this.price=price;}
void setQtyInStock()
{   this.qtyInStock=qtyInStock;}
public static void main(String args[])
{
  Book b=new Book();
System.out.println("The book name is="+b.getName());
b.setPrice(478.9);
System.out.println("The book price is ="+b.getPrice());
b.setQtyInStock();
System.out.println("The book QtyInStock is ="+b.getQtyInStock());
Author a=new Author();
System.out.println("The author name is="+a.getname());
System.out.println("The author email is="+a.getemail());
System.out.println("The author gender is="+a.getgender());
}
}
