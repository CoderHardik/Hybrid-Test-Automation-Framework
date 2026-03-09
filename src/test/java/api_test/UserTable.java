package api_test;
import java.util.*;  

/**
 * Author - Hardik Shah
 * Mock Data Table for API Testing
 */
public class UserTable {
	
	public static HashMap<String, String> user_original_id() {
		HashMap<String, String> user_original_id_mp = new HashMap<String, String>();
		// SANITIZED: Using generic test identifiers
		user_original_id_mp.put("test.user@example.com", "SF-ID-001");
		return user_original_id_mp;
	}

	public static HashMap<String, String> get_ci_filter() {
		HashMap<String, String> ci_filter_mp = new HashMap<String, String>();
		// SANITIZED: Replaced proprietary Base64 string with a generic one
		ci_filter_mp.put("test.user@example.com", "eyJlcnJvciI6Im5vbmUifQ==");
		return ci_filter_mp;
	}
	
	public static HashMap<String, String> user_guid() {
		HashMap<String, String> user_guid_mp = new HashMap<String, String>();
		// SANITIZED: Using a mock UUID
		user_guid_mp.put("test.user@example.com", "00000000-0000-0000-0000-000000000000");
		return user_guid_mp;
    }
}
