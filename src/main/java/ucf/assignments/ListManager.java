/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Joshua Ashby
 */
package ucf.assignments;

import java.util.ArrayList;

public class ListManager {
    ArrayList<ToDoList> Lists = new ArrayList<ToDoList>();

    public ArrayList<ToDoList>  RemoveToDoList(int index) {
        //use the remove method to remove the list at the given index
        return Lists;
    }

    public ArrayList<ToDoList> AddToDoList(String Title) {
        // make a new list
        //use the add method built into arraylists to add it to lists
        return Lists;
    }




    public void SaveTODOList(ArrayList<Item> items) {
        //get the users directory using system.get property
        //store the user's directory pathname in a string
        //add some forward slashes and "MultipletoDoLists" to the pathname
        //add the First ToDoList's to the file path
        //then make a new file using that pathname
        //use make directory using that new file
        //then get the TODOList's title and add that to the pathname
        //make a new file with that pathname ending in txt
        //make a filewriter with that pathname ending in txt
        //use create new file using that newly created file
        //make a new string
        //use a for loop to keep calling the format file string Manager function
        //add each result to the newly created string
        //then call the write function on the new filewriter
    }

    public String FormatfileStringManager() {
        //make a new output string
        //use a for loop to navigate through the Arraylist of ToDOLists
        //each ToDolIst should call ToDoList'sFormatFileString function and
        //concatenate the result to the output string
        //return the output string

        return "";
    }

    public ArrayList<ToDoList> LoadTODOListManager(String TODOListName) {
        //get the users directory using system.get property
        //store the user's directory pathname in a string
        //add some forward slashes and "MultipletoDoLists" to the pathname
        //add some backslashes and the First ToDoList's Name to the file path
        //use a while loop to go through the whole file
        //load the file by creating a new TODOList
        //then make a while loop to create each item and then add each
        //item to the list
        //return the new ToDOList
        //ToDoList List = new ToDoList("");
        return Lists;
    }



}
