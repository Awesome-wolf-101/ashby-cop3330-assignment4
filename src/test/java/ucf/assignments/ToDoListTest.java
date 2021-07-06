/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Joshua Ashby
 */
package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void searchDueDate() {
        //I would create a new item by using the item constructor
        //and give said item a specific due date
        //make a new toDoList
        //add that item to the todoList
        //then I would call search due date on that TODOList using that DueDate
        //I would see if it returned -1 using an assertequals
    }

    @Test
    void searchDescription() {
        //I would create a new item by using the item constructor
        //and give said item a specific Desciption
        //make a new toDoList
        //add that item to the todoList
        //then I would call search due Description on that
        //I would see if it returned -1 using an assertequals
    }

    @Test
    void getItems() {
        //I would create a TodoList
        //Create a new ArrayList of items
        //call get items
        //I would then use an assert equals to see if this Arraylist of items is the same as what getitems returns
    }

    @Test
    void setItems() {
        //I would create a TodoList
        //Create a new ArrayList of items
        //call set items and pass in the arraylist of items
        //I would then use an assert equals to see if this Arraylist of items is the same as what setitems returns
    }

    @Test
    void getTitle() {
        //I would create a TodoList
        //I would use the ToDoLists constructor to give the ToDoList a specific title
        //call get title
        //I would then use an assert equals to see if this A Title s is the same as the title I gave the original ToDoList
    }

    @Test
    void setTitle() {
        //I would create a TodoList
        //I would use setTitle to give the ToDoList a specific title
        //I would then use an assert equals to see if this ToDOList's title
        // is the same as the title I entered into setTitle
    }

    @Test
    void addItem() {
        //I would create a TodoList
        //I would use add item to add a new item to the ToDoList
        //then I would call addItem, and then
        //I would then use an assert equals to see if this ToDOList's size was not equal to 0
    }

    @Test
    void removeItem() {
        //I would create a TodoList
        //I would use add item to add a new item to the ToDoList
        //then I would call remove Item, and then
        //I would then use an assert equals to see if this ToDOList's size was  equal to 0
    }

    @Test
    void displayAllItems() {
        //I would create a TodoList
        //I would use add item to add a new item to the ToDoList
        //then I would create a new string for what the expected output would be
        //I would then use an assert equals to see if this displayall items output was equal
        // to the newly created string

    }

    @Test
    void displayCompleteItems() {
        //I would create a TodoList
        //I would use add item to add a new item to the ToDoList
        //I would use add item to add a new item to the ToDoList, and make this item's
        // is completed attribute true
        //then I would create a new string for what the expected output would be
        //I would then use an assert equals to see if this displayallCompleteItems items output was equal
        // to the newly created string
    }

    @Test
    void displayIncompleteItems() {
        //I would create a TodoList
        //I would use add item to add a new item to the ToDoList
        //I would use add item to add a new item to the ToDoList, and make this item's
        // is completed attribute true
        //then I would create a new string for what the expected output would be
        //I would then use an assert equals to see if this displayallIncompleteItems items output was equal
        // to the newly created string
    }

    @Test
    void saveTODOList() {
        //make a new ToDOList
        //add one item to the new toDoList
        //call save toDoList
        //make sure that the file exists in the new working directory using assert equals

    }

    @Test
    void formatfileString() {
        //make a new ToDOList
        //add one item to the new toDoList
        //call formatfileString and store it in a new string
        //make a string for what you expect the output to be
        //use an assert equals to make sure this string is equal to the
        //string created by formatfileString

    }

    @Test
    void loadTODOList() {
        //make a new ToDOList
        //add one item to the new toDoList
        //call save toDoList
        //call load toDoList and store it in a new ToDoList variable
        //use an assert equals to see if that ToDoList equals the originally created ToDoList

    }

    @Test
    void isDateFormatCorrect() {
    //make a new string with a correct date format
        //call isDateFormatCorrect() on this string and store the result in a boolean
        //use an assert equal to tell if what the function returned is equal to true.
    }

    @Test
    void sortToDOListDueDate() {
        //make a new ToDOList
        //create three new items each with the same year and month but different days
        //add items to the new toDoList
        //call sortToDOListDueDate
        //call get description on the new ToDoList to ensure that
        //use an assert equals to see if that ToDoList equals the originally created ToDoList
    }
}