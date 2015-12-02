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
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        result = prime * result + ((Price == null) ? 0 : Price.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((info == null) ? 0 : info.hashCode());
        result = prime * result
                + ((publishDate == null) ? 0 : publishDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (Id == null)
        {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (Name == null)
        {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        if (Price == null)
        {
            if (other.Price != null)
                return false;
        } else if (!Price.equals(other.Price))
            return false;
        if (author == null)
        {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (info == null)
        {
            if (other.info != null)
                return false;
        } else if (!info.equals(other.info))
            return false;
        if (publishDate == null)
        {
            if (other.publishDate != null)
                return false;
        } else if (!publishDate.equals(other.publishDate))
            return false;
        return true;
    }

    @Override
    public String toString()
    {
        return "Book [Id=" + Id + ", Name=" + Name + ", author=" + author
                + ", Price=" + Price + ", info=" + info + ", publishDate="
                + publishDate + "]";
    }

}
