//goods.java
package Second_hand_market;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class goods {
	public Object[][] table(){
		Object[][] data = new String[20][3];
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql="SELECT pro_name,price,pro_type,pro_des FROM pro";
			st = conn.clientPrepareStatement(sql);
			st.setString(1, "3");
			rs = st.executeQuery();
			for(int i=0;rs.next();i++) {
				data[i][0]=rs.getString("pro_name");
				data[i][1]=rs.getString("price");
				data[i][2]=rs.getString("pro_type");
				data[i][3]=rs.getString("pro_des");
			}
			return data;
			
		}
		catch(SQLException throwables) {
		
		}
	}

}
