package entities;

import java.util.Date;

public class Book
{
    private Integer Id;
    private String Name;
    private String author;
    private Double Price;
    private String info;
    private Date publishDate;

    public Book()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public Book(String name, String author, Double price, String info,
            Date publishDate)
    {
        super();
        Name = name;
        this.author = author;
        Price = price;
        this.info = info;
        this.publishDate = publishDate;
    }

    public Integer getId()
    {
        return Id;
    }

    public void setId(Integer id)
    {
        Id = id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Double getPrice()
    {
        return Price;
    }

    public void setPrice(Double price)
    {
        Price = price;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }

    public Date getPublishDate()
    {
        return publishDate;
    }

    public void setPublishDate(Date publishDate)
    {
        this.publishDate = publishDate;
    }

    @Override
    public String toString()
    {
        return "Book [Id=" + Id + ", Name=" + Name + ", author=" + author
                + ", Price=" + Price + ", info=" + info + ", publishDate="
                + publishDate + "]";
    }

}
