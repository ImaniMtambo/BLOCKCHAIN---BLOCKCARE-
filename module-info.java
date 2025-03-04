module mini {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires blockchain;
	
	opens application to javafx.graphics, javafx.fxml;
}
