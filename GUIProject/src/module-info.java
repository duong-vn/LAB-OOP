/**
 * 
 */
/**
 * 
 */
module GUIProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires transitive javafx.graphics;
	requires javafx.base;
	requires java.desktop;

	opens hust.soict.hedspi.javafx to javafx.fxml;

	exports hust.soict.hedspi.javafx;
}