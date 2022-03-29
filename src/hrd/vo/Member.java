package hrd.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	private int custNo;
	private String custName;
	private String phone;
	private String address;
	private Date reg_date;
	private String grade;
	private String city;
}
