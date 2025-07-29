package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LibraryController {

    @FXML private TextField titleField;
    @FXML private TextField authorField;
    @FXML private TextField isbnField;
    @FXML private TableView<Book> bookTable;
    @FXML private TableColumn<Book, String> titleColumn;
    @FXML private TableColumn<Book, String> authorColumn;
    @FXML private TableColumn<Book, String> isbnColumn;

    private ObservableList<Book> bookList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        titleColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getTitle()));
        authorColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getAuthor()));
        isbnColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getIsbn()));

        bookTable.setItems(bookList);
        
        // Add some sample data
        addSampleData();
    }
    
    private void addSampleData() {
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5"));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"));
        bookList.add(new Book("1984", "George Orwell", "978-0-452-28423-4"));
    }

    @FXML
    public void addBook() {
        String title = titleField.getText();
        String author = authorField.getText();
        String isbn = isbnField.getText();

        if (title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
            showAlert("Error", "All fields are required!");
            return;
        }

        bookList.add(new Book(title, author, isbn));
        clearFields();
    }

    @FXML
    public void deleteBook() {
        Book selected = bookTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            bookList.remove(selected);
        } else {
            showAlert("Error", "Please select a book to delete.");
        }
    }

    private void clearFields() {
        titleField.clear();
        authorField.clear();
        isbnField.clear();
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
