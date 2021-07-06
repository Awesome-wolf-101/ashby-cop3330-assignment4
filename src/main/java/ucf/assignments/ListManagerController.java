/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Joshua Ashby
 */
package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.util.ArrayList;

public class ListManagerController {
    @FXML
    public ListView TODOLISTSFIELD;

    @FXML
    public TextArea ItemsTextArea;
    public TextField EditDescriptionCurrentItemDueDate;
    public TextField EditDescriptionCurrentItemDescription;
    public TextField EditDueDateNewDueDate;
    public TextField EditDueDateCurrentItemDescription;
    public TextField EditDueDateCurrentItemDueDate;
    public TextField EditCompletedStatusCurrentItemDescription;
    public TextField EditCompletedStatusCurrentItemDueDate;
    public TextField EditCompletedStatusNewCompletedStatus;
    public TextField EditDescriptionNewDescription;
    public TextField AddItemNewItemDescription;
    public TextField AddItemNewItemDueDate;
    public TextField DeleteItemCurrentItemDesciption;
    public TextField DeleteItemCurrentItemDueDate;
    public TextField LoadToDoListToDoListTitle;
    public TextField NewToDoListTitleTextField;

//create a new array list of ToDOLists to keep track of them all
    @FXML
    public void ShowAllIncompleteClicked(ActionEvent actionEvent) {
        //I would call the DisplayIncompleteItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void ShowAllCompleteItemsClicked(ActionEvent actionEvent) {
        //I would call the DisplayCompleteItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void SaveToDoListClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //then call saveToDoList on that ToDoList
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void DeleteItemClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //  get the text from DeleteItemCurrentItemDesciption or DeleteItemCurrentItemDueDate
        // pass either one into the search by due date function, or the search by description to find
        //the item's index
        //use the RemoveItem function to remove the item from the ToDoList
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void EditDescriptionClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //  get the text from EditDescriptionCurrentItemDescription or EditDescriptionCurrentItemDueDate
        // pass either one into the search by due date function, or the search by description to find
        //the item's index
        //get the text in the EditDescriptionNewDescription field and use the setDescription function
        //to change that item's description
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void AddItemClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //  get the text from AddItemNewItemDescription or AddItemNewItemDueDate
        //use the AddItem function from ToDOList by pasing in the new text
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void SaveListOFToDoListsClicked(ActionEvent actionEvent) {
        //I could call the SaveListOfTODOLists function on the ArrayList of Lists in order
        //to save the lists of lists to external storage
    }

    @FXML
    public void LoadTODOLISTClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //make a new string to store LoadToDoListToDoListTitle's text
        //Call the current ToDOList's LoadTODOList function
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void EditDueDateClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //  get the text from EditDueDateCurrentItemDescription or EditDueDateCurrentItemDueDate
        // pass either one into the search by due date function, or the search by description to find
        //the item's index
        //get the text in the EditDueDateNewDueDate field and use the setDueDate function
        //to change that item's description
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void EditCompletedStatusClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //  get the text from EditCompletedStatusCurrentItemDescription or EditCompletedStatusCurrentItemDueDate
        // pass either one into the search by due date function, or the search by description to find
        //the item's index
        //get the text in the EditCompletedStatusNewCompletedStatus field and use the setsetCompleted function
        //to change that item's description
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void SortALLItemsClicked(ActionEvent actionEvent) {

    }

    @FXML
    public void ShowAllItemsClicked(ActionEvent actionEvent) {
        //I would call the DisplayAllItems function on the currently clicked ToDOList in the ListView
        //I would store the returned string in a new string variable
        //and then I would display the text in the ItemsTextArea
    }

    @FXML
    public void LoadListOfTODOLISTsClicked(ActionEvent actionEvent) {
        //call the LoadListofTODOLists function, and set the current
        //array list of ToDOLists to the returned ArrayList of ToDOLists
    }

    @FXML
    public void DeleteThisTODOLISTClicked(ActionEvent actionEvent) {
        //use ListViewListClicked to find the index of the given ToDoList
        //then call the RemoveToDoList function
    }

    @FXML
    public void AddToDoListClicked(ActionEvent actionEvent) {
        //get the text from the NewToDoListTitleTextField text field
        //pass that text into the AddToDoList function
    }

    public void DisplayItems(ToDoList List)
    {
        //displays all of the items and their attributes
        //in a given ToDoList on the ItemsTextArea
    }

    public int ListViewListClicked(MouseEvent mouseEvent) {
        //use listview's getSelectionModel and getSelectedIndices method to find the index of the
        //selected ToDOList
        return -1;
    }

    public ListCell<ToDoList> call(ListView<ToDoList> p) {

        ListCell<ToDoList> cell = new ListCell<ToDoList>(){

            @Override
            protected void updateItem(ToDoList list, boolean bln) {
            //use  class to set the text in the list cell to the title of the ToDOList
            }

        };

        return cell;
    }

    public void SaveListOfTODOList(ArrayList<Item> items) {
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

    public ArrayList<ToDoList> LoadListofTODOLists(String TODOListName) {
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
        ArrayList<ToDoList> Lists = new ArrayList<ToDoList>();
        return Lists;
    }

    public ArrayList<ToDoList>  RemoveToDoList(int index) {
        //use the remove method to remove the list at the given index
        //using array lists built-in remove function
        ArrayList<ToDoList> Lists = new ArrayList<ToDoList>();
        return Lists;
    }

    public ArrayList<ToDoList> AddToDoList(String Title) {
        // make a new list
        //use the add method built into arraylists to add it to lists
        ArrayList<ToDoList> Lists = new ArrayList<ToDoList>();
        return Lists;
    }
}
