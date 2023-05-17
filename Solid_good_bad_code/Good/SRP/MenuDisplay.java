class MenuDisplay {
    public String displayMenu(){
        UserValidation user = new UserValidation();
        if(user.isValidUser()) {
            return "<h2>Fruits List</h2><menu>li>Oranges</li><li>Pineapple<li><li>Apples</li><li>Grapes</li></menu>";
        }
        else{
            return "<h1> User is Invalid! Menu option cannot be displayed!! <h1>";
        }
    }
}