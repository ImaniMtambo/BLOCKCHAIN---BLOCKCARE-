package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import acsse.csc03a3.Block;
import acsse.csc03a3.Blockchain;
import acsse.csc03a3.Transaction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MiniProjectController {
	
	
	//login form
	   @FXML
	    private Button loginBtn;

	    @FXML
	    private TextField password;

	    @FXML
	    private TextField username;

	    @FXML
	    void validate(ActionEvent event) {
	    	 String enteredUsername = username.getText();
	         String enteredPassword = password.getText();

	         if (validateCredentials(enteredUsername, enteredPassword)) {
	             switchToMiniProject(event); 
	         } else {
	             System.out.println("Authentication failed. Please check your credentials.");
	         }
	    }
	    
	    //helper method to validate the username and password
	    public boolean validateCredentials(String enteredUsername, String enteredPassword) {
	    	String filePath = System.getProperty("user.dir") + File.separator + "credentials.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(" "); 
                    if (parts.length == 2) {
                        String usernameFromFile = parts[0];
                        String passwordFromFile = parts[1];
                        if (usernameFromFile.equals(enteredUsername) && passwordFromFile.equals(enteredPassword)) {
                            return true; 
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false; 
        }  
	    
	    private void switchToMiniProject(ActionEvent event) {
	        try {
	            // Load miniProject.fxml from the application package
	        	Parent root = FXMLLoader.load(getClass().getResource("miniProject.fxml"));
	            Scene scene = new Scene(root);

	            // Get the stage from the event
	            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

	            // Set the scene to the stage
	            stage.setScene(scene);
	            stage.show();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	@FXML
	private Text treatment_planT;
	
    @FXML
	private TextField treatment_plan_field;
	

	@FXML
	private Text conditionDiscription;
	
	@FXML
	private Text phoneNumber;
	
	@FXML
	private Text DoctorsEmail;
	
	@FXML
	private Text DoctorsPhoneNumber;
	
	@FXML
	private Text Hospital;
	
	@FXML
	private Text checkUpDate;
	
	@FXML
	private Text checkUpLocation;
	
	@FXML
	 private Text liver;
	
	@FXML
    private Text lungs;
	
	//new text fields
	 @FXML
	  private TextField doctor_number_input_filed;

	 @FXML
	 private TextField doctorsEmail_input_filed;
	    
	 @FXML
	 private TextField Condition;
	    
	 @FXML
	 private TextField conditionManagenemnt;
	    
	 @FXML
	 private TextField hospitai_input_filed;
	    
	  @FXML
	  private Text checkUpType;
	    
	  @FXML
	   private Text name;

	   @FXML
	   private Text surgicalHistory;

	   @FXML
	   private Text surname;
	   
	   @FXML
	    private Text userEmail;
	   
	   @FXML
	    private Text doctor;
	    
	    @FXML
	    private Text manaGementDiscription;

	    @FXML
	    private Text managenemnt;
	    
	    @FXML
	    private Text condition;
	    
	    @FXML
	    private Text heartRate;
	    
	    @FXML
	    private Text doctorName;
	

    @FXML
    private MenuItem CheckUp;

    @FXML
    private MenuItem Other;

    @FXML
    private Label appointment_type_label;

    @FXML
    private TextField blood_glucose_input;

    @FXML
    private Label blood_glucose_label;

    @FXML
    private TextField date_input_field;

    @FXML
    private Label date_label;

    @FXML
    private TextField doctor_input_field;

    @FXML
    private Label doctor_label;

    @FXML
    private TextField email_input_field;

    @FXML
    private Label email_label;

    @FXML
    private TextField heart_rate_input_field;

    @FXML
    private Label heart_rate_label;

    @FXML
    private TextField location_input_field;

    @FXML
    private Label location_label;

    @FXML
    private MenuButton menuButton;

    @FXML
    private TextField name_surname_input;

    @FXML
    private Label name_surname_label;

    @FXML
    private TextField phone_number_input;

    @FXML
    private Label phone_number_label;

    @FXML
    private Label prescription_history_label;

    @FXML
    private TextField prescription_input_field;

    @FXML
    private Button submitHealthReading;

    @FXML
    private TextField surgical_history_input_field;

    @FXML
    private Label surgical_history_label;

    @FXML
    private TextField time_input_field;

    @FXML
    private Label time_label;

    @FXML
    void handleMenuItemAction(ActionEvent event) {
    	 MenuItem menuItem = (MenuItem) event.getSource();

    	    if (menuItem == CheckUp) {
    	        // Handle CheckUp menu item selection
    	      
    	        menuButton.setText("CheckUp");
    	        
    	    } else if (menuItem == Other) {
    	        // Handle Other menu item selection
    	      
    	        menuButton.setText("Other");
    	    }
    }
    
    @FXML
    void submitHealthReading(ActionEvent event) {

    	    String timeText = menuButton.getText();
    	    String doctorText = doctor_input_field.getText();
    	    String locationText = location_input_field.getText();
    	    String dateText = date_input_field.getText();
    	    String bloodGlucoseText = blood_glucose_input.getText();
    	    String emailText = email_input_field.getText();
    	    String heartRateText = heart_rate_input_field.getText();
    	    String nameSurnameText = name_surname_input.getText();
    	    String phoneNumberText = phone_number_input.getText();
    	    String prescriptionText = prescription_input_field.getText();
    	    String surgicalHistoryText = surgical_history_input_field.getText();
    	    String conditionText = Condition.getText();
    	    String conditionManagementText = conditionManagenemnt.getText();
    	    String doctorNumberText = doctor_number_input_filed.getText();
    	    String doctorsEmailText = doctorsEmail_input_filed.getText();
    	    String hospitalText = hospitai_input_filed.getText();
    	    String treatment_planTest =  treatment_plan_field.getText();
    	    
    	    doctorName.setText(doctorText);
    	    lungs.setText(bloodGlucoseText);
    	    userEmail.setText(emailText);
    	    DoctorsEmail.setText(doctorsEmailText);
    	    DoctorsPhoneNumber.setText(doctorNumberText);
    	    Hospital.setText(hospitalText);
    	    checkUpDate.setText(dateText);
    	    checkUpLocation.setText(locationText);
    	    checkUpType.setText(timeText);
    	    condition.setText(conditionText);
    	    liver.setText(bloodGlucoseText);
    	    conditionDiscription.setText(conditionManagementText);
    	    doctor.setText(doctorText);
    	    heartRate.setText(heartRateText);
    	    manaGementDiscription.setText(surgicalHistoryText);
    	    managenemnt.setText(prescriptionText); 
    	    name.setText(nameSurnameText);
    	    phoneNumber.setText(phoneNumberText);
    	    surgicalHistory.setText(surgicalHistoryText);
    	    surname.setText(nameSurnameText); 
    	    String appointmentType = appointment_type_label.getText();
    	    treatment_planT.setText(treatment_planTest);
    	    
    	    time_input_field.setText("");
    	    doctor_input_field.setText("");
    	    location_input_field.setText("");
    	    date_input_field.setText("");
    	    blood_glucose_input.setText("");
    	    email_input_field.setText("");
    	    heart_rate_input_field.setText("");
    	    name_surname_input.setText("");
    	    phone_number_input.setText("");
    	    prescription_input_field.setText("");
    	    surgical_history_input_field.setText("");
    	    Condition.setText("");
    	    conditionManagenemnt.setText("");
    	    doctor_number_input_filed.setText("");
    	    doctorsEmail_input_filed.setText("");
    	    hospitai_input_filed.setText("");
    	    treatment_plan_field.setText("");

    	 // Construct a HealthReading object
    	    HealthReading healthReading = new HealthReading(timeText, doctorText, locationText, dateText, bloodGlucoseText, emailText, 
    	    		heartRateText, nameSurnameText, phoneNumberText, prescriptionText, surgicalHistoryText, appointmentType, conditionText,
    	    		conditionManagementText, doctorNumberText, doctorsEmailText, hospitalText, treatment_planTest);  
    	
    	 // Create a Transaction using the HealthReading object
    	    Transaction<HealthReading> transaction = new Transaction<>("sender", "receiver", healthReading);

    	// Instantiate the Blockchain
    	   Blockchain<HealthReading> blockchain = new Blockchain<>();
    	 
    	// Check if the blockchain is empty before adding the block
    	   if (blockchain.isChainValid()) {
    	       // Register a stakeholder with a stake
    	       blockchain.registerStake("nodeAddress", 100);
    	   }
    	 
    	// Add the transaction to a list
    	   List<Transaction<HealthReading>> transactions = new ArrayList<>();
    	   transactions.add(transaction);

    	// Create a new Block instance with the previous hash as empty and transactions list
    	   Block<HealthReading> block = new Block<>("", transactions);

    	   // Add the block to the blockchain
    	   blockchain.addBlock(transactions);

    	   // Store the hash of the current block as the previous hash for the next block
    	   String previousHash = block.getHash();
    	   
    	   
    	// Print the blockchain to see if the block is added successfully
    	   System.out.println(blockchain.toString());
    	 	    
    }

}
