package publicTransport;

import transport.Vehicle;

public class Bus extends Vehicle{
    private int licenseNo;
    public void setLicenseNo(int licenseNo){
        this.licenseNo=licenseNo;
    }
    public int getLicenseNo(){
        return licenseNo;
    }
    Bus(int  licenseNo){
        super(4);
        this.licenseNo = licenseNo;
    }

}
