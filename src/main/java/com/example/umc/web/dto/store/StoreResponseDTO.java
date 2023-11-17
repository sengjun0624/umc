package com.example.umc.web.dto.store;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StoreResponseDTO {

	public static class StoreSaveResultDTO {
		private Long storeId;
		LocalDateTime createdAt;
	}

}
