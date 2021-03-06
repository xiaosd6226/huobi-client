package org.oxerr.huobi.websocket.dto.response.historydata;

import org.oxerr.huobi.websocket.dto.response.ReqResponse;
import org.oxerr.huobi.websocket.dto.response.payload.ReqMarketDetailPayload;

/**
 * Response of market details.
 */
public class ReqMarketDetailResponse extends ReqResponse<ReqMarketDetailPayload> {

	public ReqMarketDetailResponse(int version, String msgType, int retCode,
			String retMsg) {
		super(version, msgType, retCode, retMsg);
	}

}
