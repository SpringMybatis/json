package com.ibs.json.demo.test;

import com.google.protobuf.InvalidProtocolBufferException;
import com.ibs.json.demo.proto.bean.MyProto;
import com.ibs.json.demo.proto.bean.Request;

public class ProtobufMainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyProto.myproto_test.Builder builder = MyProto.myproto_test.newBuilder();
		builder.setCmd("ontouch");
		builder.setKeycode(25);

		MyProto.myproto_test myproto = builder.build();

		System.out.println(myproto.getKeycode());

		byte[] buffer = myproto.toByteArray();

		try {
			MyProto.myproto_test myproto1 = MyProto.myproto_test.parseFrom(buffer);
			
			System.out.println(myproto1.getCmd());

		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}

		Request.Request_Properties.Builder requestBuilder = Request.Request_Properties.newBuilder();
		requestBuilder.setCmd("svn update");
		requestBuilder.setKey(1225);

		Request.Request_Properties request = requestBuilder.build();
		System.out.println(request.getKey());

		byte[] buf = request.toByteArray();

		try {
			Request.Request_Properties myproto2 = Request.Request_Properties.parseFrom(buf);

			System.out.println(myproto2.getCmd());

		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}

	}

}
