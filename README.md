# Library Management System

A simple Library Management System built with Java and JavaFX featuring a clean, minimal UI.

## Features

- Add new books with title, author, and ISBN
- View all books in a table format
- Delete selected books
- Input validation for required fields
- Clean and intuitive user interface

## Project Structure

```
LMS/
├── src/
│   ├── application/
│   │   ├── Main.java              # JavaFX Application entry point
│   │   ├── Book.java              # Book model class
│   │   ├── LibraryController.java # Controller for UI interactions
│   │   └── library_view.fxml      # FXML layout file
│   └── module-info.java           # Module configuration
├── run.bat                        # Batch file to compile and run
└── README.md                      # This file
```

## Requirements

- Java 11 or higher
- JavaFX SDK (download from https://openjfx.io/)

## Setup and Running

### Option 1: Using run.bat (Recommended)

1. **Install JavaFX SDK:**
   - Download JavaFX SDK from https://openjfx.io/
   - Extract it to a location (e.g., `C:\Program Files\Java\javafx-sdk-21.0.1\`)

2. **Update JavaFX Path:**
   - Open `run.bat`
   - Update the `JAVAFX_PATH` variable to point to your JavaFX lib directory

3. **Run the Application:**
   - Open PowerShell/Command Prompt in the LMS directory
   - Run: `.\run.bat` (PowerShell) or `run.bat` (Command Prompt)
   - The application will compile and launch automatically

### Option 2: Manual Compilation

```bash
# Navigate to src directory
cd LMS/src

# Compile (adjust JavaFX path as needed)
javac --module-path "C:\Program Files\Java\javafx-sdk-21.0.1\lib" --add-modules javafx.controls,javafx.fxml application\*.java

# Run (adjust JavaFX path as needed)
java --module-path "C:\Program Files\Java\javafx-sdk-21.0.1\lib" --add-modules javafx.controls,javafx.fxml application.Main
```

### Option 3: Using IDE
- Import the project into your IDE (Eclipse, IntelliJ IDEA, etc.)
- Configure JavaFX library in your project settings
- Run the `Main.java` file

### Troubleshooting
- If compilation fails, ensure JavaFX SDK is properly installed
- Update the JavaFX path in run.bat to match your installation
- For PowerShell, use `.\run.bat` instead of just `run.bat`
- Try `run_simple.bat` for basic compilation without JavaFX runtime

## Usage

1. **Adding Books:**
   - Fill in the Title, Author, and ISBN fields
   - Click "Add Book" button
   - The book will appear in the table below

2. **Deleting Books:**
   - Select a book from the table
   - Click "Delete Book" button
   - The selected book will be removed

3. **Validation:**
   - All fields are required when adding a book
   - Error alerts will show if any field is empty

## Future Enhancements

- Search functionality
- Edit existing books
- Data persistence (save/load from file)
- Book availability status
- User management
- Due date tracking
