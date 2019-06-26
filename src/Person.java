public class Person {
    //set variables to private

    private String Name;
    private String Email;
    private String FavouriteColor;
    //created constructor so object can be called

    public Person() {
    }
    //created overloaded constructor so it returns these values when called upon
    public Person(String name, String email, String favouriteColor) {
        Name = name;
        Email = email;
        FavouriteColor = favouriteColor;
    }

    //displaying message
    public String getDisplayText() {
        return  ("Person: " + Name + "\nEmail: " + Email + "\nFavourite Color: \n" + FavouriteColor);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFavouriteColor() {
        return FavouriteColor;
    }

    public void setFavouriteColor(String favouriteColor) {
        FavouriteColor = favouriteColor;
    }
}
