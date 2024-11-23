package se.lexicon.model;

public enum VehicleType {
    CAR(1,"Car1"),
    MOTORCYCLE(2,"Motorcycle1"),
    ELECTRIC(3,"Electric1");

    private final int code;
    private final String name;

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

    public static VehicleType getVehicleType(int code) {

        for (VehicleType type : VehicleType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        //throw new IllegalArgumentException("No VehicleType with code " + code + " found");
        throw new EnumConstantNotPresentException(VehicleType.class, String.valueOf(code));

    }

}
