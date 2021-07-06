/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Joshua Ashby
 */
package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {
    //String ToDoListTitle = "";
    //ArrayList<Item> items = new ArrayList<Item>();

    public  ToDoList(String Title)
    {
        //this one is just a simple constructor that set' up a TodoList's tittle
        //it sets the title passed in to the ToDoList's title
    }
    public int searchDueDate(String searchDueDate)
    {
        //this function will use a for loop to look for a item with a duedate that matches
        //the input string inside of the arraylist of items
        //if it can't find one it will return -1;

        return -1;
    }

    public int searchByDescription(String searchDescription)
    {
        //this function will use a for loop to look for a item with a description that matches
        //the input string inside of the arraylist of items
        // if it can't find one it will return -1;

        return -1;
    }

    public ArrayList<Item> getItems() {
        // get ToDoList's items;
        ArrayList<Item> items = new ArrayList<Item>();
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        // set ToDoList's items;
        // this.items is now equal to  items;
    }

    public String getTitle() {
        // get ToDoList's Title;
        return "Title";
    }

    public void setTitle(String title) {
        // set ToDoList's Title;
        //Title = title;
    }

    public void AddItem(String Description, String DueDate) {
        //uses the Item Constructor to create a new item then
        //uses ArrayLists built in Add function to Add that item
        //to the items arraylist
        //Title = title;
    }

    public void RemoveItem(String Description, String DueDate) {
        //uses the previous methods to search for an item's index
        // using due date or description then
        //uses ArrayLists built in remove function to remove that item
        //to the items arraylist
        //Title = title;
    }

    public String DisplayAllItems(ArrayList<Item> items) {
        //Initialize an output String use a for loop to go through every item in
        //the ToDoList, then add those items to the output string and after every item
        // add a new line and return the output string

        return "";
    }

    public String DisplayCompleteItems(ArrayList<Item> items) {
        //Initialize an output String use a for loop to go through every item in
        //the ToDoList, then add those items to the output string and after every item
        // add a new line if the item's isCompleted
        //boolean variable is equal to true
        // and return the output string

        return "";
    }

    public String DisplayIncompleteItems(ArrayList<Item> items) {
        //Initialize an output String use a for loop to go through every item in
        //the ToDoList, then add those items to the output string and after every item
        //add a new line if the item's isCompleted
        //boolean variable is equal to false
        // and return the output string

        return "";
    }

    public void SaveTODOList(ArrayList<Item> items) {
        //get the users directory using system.get property
        //store the user's directory pathname in a string
        //add some forward slashes and" Individual toDoLists" to the pathname
        //add the ToDoList's name to the file path
        //then make a new file using that pathname
        //use make directory using that new file
        //then get the TODOList's title and add that to the pathname
        //make a new file with that pathname ending in txt
        //make a filewriter with that pathname ending in txt
        //use create new file using that newly created file
        //make a new string to store the result of the format file string function
        //then call the write fucntion on the new filewriter
    }

    public String FormatfileString() {
    //make a new output string
        //add the title of the ToDOList to the outputstring
        //add an opening square bracket
        //use a for loop to go though all the items in the "items" arraylist
        //for every item in the arraylist add the title, duedate, and iscompleted to the output string
        //while putting commas in between the three attributes and add a newline at the end of each item
        //add a closing square bracket
        //return the output string

        return "";
    }

    public ToDoList LoadTODOList(String TODOListName) {
        //get the users directory using system.get property
        //store the user's directory pathname in a string
        //add some forward slashes and" Individual toDoLists" to the pathname
        //add some backslashes and the ToDoListName to the file path
        //load the file by creating a new TODOList
        //then make a while loop to create each item and then add each
        //item to the list
        //return the new ToDOList
        ToDoList List = new ToDoList("");
        return List;
    }

    public boolean IsDateFormatCorrect(String Date) {
        //turn the string into a string array
        //use a for loop to check that the first four numbers are
        //int parseable if they are not return false
        //make sure that the next next character is a "-"
        //make sure the next two characters are also parseable
        //make sure those characters are followed by a "-"
        //make sure the next two characters are also parseable integers
        // if all of these are true, return true

        return true;
    }

    public void SortToDOListDueDate() {
    // use the sort function on the arraylist of items, change the compare function
        //such that it compares DueDates given two objects
    }

}
