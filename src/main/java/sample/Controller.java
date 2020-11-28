package sample;

import cn.hutool.core.codec.Base64;
import cn.hutool.json.JSONUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

public class Controller {

	@FXML
	private TextArea plaintextMessage;

	@FXML
	private TextArea decryptMessage;

	@FXML
	private TextArea publicKey;

	@FXML
	private TextArea privateKey;

	public void base64Decrypt(MouseEvent mouseEvent) {
		decryptMessage.setText(Base64.decodeStr(JSONUtil.formatJsonStr(plaintextMessage.getText())));
	}

	public void cryptBase54(MouseEvent mouseEvent) {
		decryptMessage.setText(Base64.encode(plaintextMessage.getText()));
	}

	public void createRsaKeyPair(MouseEvent mouseEvent) throws Exception{
		KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
		KeyPair keyPair = rsa.generateKeyPair();
		publicKey.setText(Base64.encode(keyPair.getPublic().getEncoded()));
		privateKey.setText(Base64.encode(keyPair.getPrivate().getEncoded()));
	}
}
