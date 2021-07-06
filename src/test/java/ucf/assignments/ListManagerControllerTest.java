/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Joshua Ashby
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerControllerTest {


    @Test
    void showAllIncompleteClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click showAllIncompleteItems
        //make sure the ItemsTextArea only presents the incomplete items
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void showAllCompleteItemsClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click showAllcompleteItems
        //make sure the ItemsTextArea only presents the complete items
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void saveToDoListClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click save This ToDoList
        //make sure that the file exists using the file exists method
        //and using an asserts equal to make sure it returns true
    }

    @Test
    void deleteItemClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click Delete Item and provide the appropriate text input
        //make sure the ItemsTextArea only presents the items that were not deleted
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void editDescriptionClicked() {
        //make a new toDoList and add an incomplete item to the list
        //click Edit Description and provide the appropriate text input
        //make sure the ItemsTextArea has the new description
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void addItemClicked() {
        //make a new toDoList
        //click Add Item and provide the appropriate text input
        //make sure the ItemsTextArea has the new item
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void saveListOFToDoListsClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click save List of ToDoLists
        //make sure that the file and file directory exist using the file exists method
        //and using an asserts equal to make sure it returns true
    }

    @Test
    void loadTODOLISTClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click save ToDoLists
        //click Load  ToDoList with the appropriate text input
        //make sure the ItemsTextArea has the saved ToDoList(s)
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals

    }

    @Test
    void editDueDateClicked() {
        //make a new toDoList and add an item to the list
        //click Edit Due Date and provide the appropriate text input
        //make sure the ItemsTextArea has the New Due Date as the item's dueDate
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void editCompletedStatusClicked() {
        //make a new toDoList and add an incomplete item to the list
        //click Edit Completed Status and provide the appropriate text input
        //make sure the ItemsTextArea has complete as the item's new status
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void sortALLItemsClicked() {
        //make a new ToDOList
        //create three new items each with the same year and month but different days
        //add items to the new toDoList
        //click sort All Items
        //make sure the ItemsTextArea has the ToDoList in order
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void showAllItemsClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click showAllItems
        //make sure the ItemsTextArea  presents all the  items
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void loadListOfTODOLISTsClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click save List of ToDoLists
        //click Load List of ToDoLists
        //make sure the ItemsTextArea has the saved ToDoList(s)
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void deleteThisTODOLISTClicked() {
        //make a new toDoList and add Items to the List
        //some of these items should be incomplete some should be complete
        //click Delete This ToDoList
        //make sure the ItemsTextArea has the saved ToDoList(s)
        //make a new expected string (it should be blank)
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void addToDoListClicked() {
        //make a new toDoList
        //click Add ToDoList with the appropraite text input
        //make sure the ListView has the saved ToDoList
        //make a new expected string (it should contain the title of the new ToDoList)
        //make sure it equals the text inside of the ListView using assert equals

    }

    @Test
    void displayItems() {
        //make a new toDoList and add Items to the List
        //call displayItems
        //make sure the ItemsTextArea has the saved ToDoList(s)
        //make a new expected string
        //make sure it equals the text inside of the ItemsTextArea using assert equals
    }

    @Test
    void listViewListClicked() {
        //make a new toDoList and add Items to the List
        //click an item on the listview
        //make sure that listViewListClicked returned the correct index
        //using an assert equals statement
    }


    @Test
    void saveListOfTODOList() {
        //make a new toDoLists and add Items to the Lists
        //some of these items should be incomplete some should be complete
        //click save List of ToDoLists
        //make sure that the file and file directory exist using the file exists method
        //and using an asserts equal to make sure it returns true
    }

    @Test
    void formatfileStringManager() {
        //make a new Array list of toDoLists and add Items to the List
        //some of these items should be incomplete some should be complete
        //call formatfileStringManager and store the result in a string
        //make an expected string
        //use an assert equals statement to make sure that the expected string
        //is equal to the result of formatfileStringManager


    }

    @Test
    void loadListofTODOLists() {
        //make a new Array list of toDoLists and add Items to the Lists
        //some of these items should be incomplete some should be complete
        //call save List of ToDoLists
        //call Load List of ToDoLists and save it in a new ToDOList
        //make sure the New List of ToDoLists equals the Original Array list of toDoLists using assert equals
    }

    @Test
    void removeToDoList() {
        //make a new Array list of toDoLists and add Items to the Lists
        //some of these items should be incomplete some should be complete
        //call remove ToDoList at an index
        //Description of the ToDolist at the index you removed is not equal to
        // it's original description using assert equals
    }

    @Test
    void addToDoList() {
        //make a new Array list of toDoLists
        //call addToDoList
        //use an assert equals to make sure that tje size of the array list does not equal one
    }
}