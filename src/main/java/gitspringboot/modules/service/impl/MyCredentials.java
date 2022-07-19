package gitspringboot.modules.service.impl;

import io.grpc.CallCredentials;
import io.grpc.Metadata;
import io.grpc.Status;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * @author xr.wei
 * @version 1.0
 * @since 2022/6/8
 */
@Component
public class MyCredentials extends CallCredentials {

	@Override
	public void applyRequestMetadata(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier) {
		executor.execute(new Runnable(){
			@Override
			public void run() {
				try {
					Metadata headers = new Metadata();
					Metadata.Key<String> app = Metadata.Key.of("app", Metadata.ASCII_STRING_MARSHALLER);
					Metadata.Key<String> token = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
					headers.put(app, "bo");
					headers.put(token, "12345");
					metadataApplier.apply(headers);
				} catch(Throwable ex) {
					metadataApplier.fail(Status.UNAUTHENTICATED.withCause(ex));
				}
			}
		});
	}

	@Override
	public void thisUsesUnstableApi() {

	}

}
