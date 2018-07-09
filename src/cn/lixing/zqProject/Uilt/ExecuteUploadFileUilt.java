package cn.lixing.zqProject.Uilt;

import java.io.IOException;

public class ExecuteUploadFileUilt {
	public static void upload() {
		try {
			Runtime.getRuntime().exec("cmd /k start upload.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
