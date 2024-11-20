package se.lexicon.model;

public enum VehicleType {
    CAR(1,"Car1"),
    MOTORCYCLE(2,"Motorcycle1"),
    ELECTRIC(3,"Electric1"),;

    private int code;
    private String name;

    VehicleType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public VehicleType getVehicleType(int code) {
        for (VehicleType vt : VehicleType.values()) {
            if (vt.code == code) {
                return vt;
            }
        }
        throw new IllegalArgumentException("Invalid Vehicle Type");
        //throw new EnumConstantNotPresentException(VehicleType.class, String.valueOf(code));
    }
}
