package sample;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.apache.commons.lang3.StringUtils;

public class Controller {

	@FXML
	private TextArea plaintextMessage;

	@FXML
	private TextArea decryptMessage;

	@FXML
	private TextArea cryptBase64Msg;

	public void base64Decrypt(MouseEvent mouseEvent) {
		decryptMessage.setText(Base64.decodeStr(JSONUtil.formatJsonStr(plaintextMessage.getText())));
	}

	public void cryptBase54(MouseEvent mouseEvent) {
		cryptBase64Msg.setText(Base64.encode(plaintextMessage.getText()));
	}
}
