package com.exercise.bll;

   public class Author {

	   private String firstName;
	   private String lastName;
	   private String bookName;
		
		/* once we have it we have to create a constructor that allows a user to input instance variables **/
	   public Author() {
	   }
	   
	   
	   public Author(String firstName,String lastName)
	   {
		this.firstName=firstName;
	    this.lastName=lastName;
		
	   }
	   public Author(String firstName,String lastName,String bookName)
	   {
	    this.firstName=firstName;
		this.lastName=lastName;
		this.bookName=bookName; 
	   }
		
	   public String getfirstName()
	   {
		return firstName;
	   }
		    
	   public String getlastName()
	   {
		return lastName;
	   }
		     
	   public String getbookName()
	  {
	   return bookName;
	  }
		     
        /* now we create a mutator method for each of the instance variables created above that allows a user to change
		* the state of the object.
		*/
	  public void setFirstName(String firstName)
	  {
	  this.firstName=firstName;
	  }
		     
      public void setlastName(String lastName)
	  {
	  this.lastName=lastName;
	  }
		      
      public void setbookName(String bookName)
	  {
      this.bookName=bookName;
	  }
	  //to return all values we use tostring method
		      
      public String toString()
	  {
	  return "The details of the book are: " + firstName + ", " + lastName + ", " + bookName;
	  }
		     
	  }


