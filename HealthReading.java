package application;

public class HealthReading {
    private String time;
    private String doctor;
    private String location;
    private String date;
    private String bloodGlucose;
    private String email;
    private String heartRate;
    private String nameSurname;
    private String phoneNumber;
    private String prescriptionHistory;
    private String surgicalHistory;
    private String appointmentType;
    private String treatment_planT;
    private String Condition;
    private String ConditionManagement;
    private String DoctorNumber;
    private String DoctorEmail;
    private String Hospital;
   
    public String getTreatment_planT() {
		return treatment_planT;
	}

	public void setTreatment_planT(String treatment_planT) {
		this.treatment_planT = treatment_planT;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	// Constructor
    public HealthReading(String time, String doctor, String location, String date,
                         String bloodGlucose, String email, String heartRate,
                         String nameSurname, String phoneNumber,
                         String prescriptionHistory, String surgicalHistory, String appointmentType,
                         String Condition, String ConditionManagement, String DoctorNumber,String DoctorEmail, String Hospital,
                         String treatment_planT) {
        this.time = time;
        this.doctor = doctor;
        this.location = location;
        this.date = date;
        this.bloodGlucose = bloodGlucose;
        this.email = email;
        this.heartRate = heartRate;
        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.prescriptionHistory = prescriptionHistory;
        this.surgicalHistory = surgicalHistory;
        this.appointmentType = appointmentType;
        this.Condition = Condition;
        this.ConditionManagement = ConditionManagement;
        this.DoctorNumber = DoctorNumber;
        this.DoctorEmail = DoctorEmail;
        this.Hospital = Hospital;
        this.treatment_planT = treatment_planT;
    }

    public String getCondition() {
		return Condition;
	}

	public void setCondition(String condition) {
		Condition = condition;
	}

	public String getConditionManagement() {
		return ConditionManagement;
	}

	public void setConditionManagement(String conditionManagement) {
		ConditionManagement = conditionManagement;
	}

	public String getDoctorNumber() {
		return DoctorNumber;
	}

	public void setDoctorNumber(String doctorNumber) {
		DoctorNumber = doctorNumber;
	}

	public String getDoctorEmail() {
		return DoctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		DoctorEmail = doctorEmail;
	}

	public String getHospital() {
		return Hospital;
	}

	public void setHospital(String hospital) {
		Hospital = hospital;
	}

	// Getters and Setters
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBloodGlucose() {
        return bloodGlucose;
    }

    public void setBloodGlucose(String bloodGlucose) {
        this.bloodGlucose = bloodGlucose;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrescriptionHistory() {
        return prescriptionHistory;
    }

    public void setPrescriptionHistory(String prescriptionHistory) {
        this.prescriptionHistory = prescriptionHistory;
    }

    public String getSurgicalHistory() {
        return surgicalHistory;
    }

    public void setSurgicalHistory(String surgicalHistory) {
        this.surgicalHistory = surgicalHistory;
    }

    // toString method
    @Override
    public String toString() {
        return "HealthReading{" +
                "time='" + time + '\'' +
                ", doctor='" + doctor + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", bloodGlucose='" + bloodGlucose + '\'' +
                ", email='" + email + '\'' +
                ", heartRate='" + heartRate + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", prescriptionHistory='" + prescriptionHistory + '\'' +
                ", surgicalHistory='" + surgicalHistory + '\'' +
                ", appointmentType='" + appointmentType + '\'' +
                
                 ", condition='" + Condition + '\'' +
                ", ConditionManagement='" + ConditionManagement + '\'' +
                ", DoctorEmail='" + DoctorEmail + '\'' +
                ", appointmentType='" + appointmentType + '\'' +
                ", treatment_planT='" + treatment_planT + '\'' +
                
                
                
                
                '}';
    }
}

