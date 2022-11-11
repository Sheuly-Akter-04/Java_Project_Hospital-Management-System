package classesh;
import java.lang.*;
public class Lab extends Facility
{
	private String xray_room;
	private String ecg_room;
	public Lab()
	{
		
	}
	public Lab(String xray_room,String ecg_room)
	{
		this.xray_room=xray_room;
		this.ecg_room=ecg_room;
	}
	public void setXrayroom(String xray_room)
	{
		this.xray_room=xray_room;
	}
	public void setECGroom(String ecg_room)
	{
		this.ecg_room=ecg_room;
	}
	public String getXrayroom()
	{
		return xray_room;
	}
	public String getECGroom()
	{
		return ecg_room;
	}
	public void showInfo()
	{
		System.out.println("Xray Room:"+xray_room);
		System.out.println("ECG Room:"+ecg_room);
	}
}