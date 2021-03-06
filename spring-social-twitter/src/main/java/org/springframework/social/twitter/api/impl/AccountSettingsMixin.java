package org.springframework.social.twitter.api.impl;

import java.util.List;

import org.springframework.social.twitter.api.AccountSettings.SleepTime;
import org.springframework.social.twitter.api.AccountSettings.TimeZone;
import org.springframework.social.twitter.api.AccountSettings.TrendLocation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class AccountSettingsMixin extends TwitterObjectMixin {

	@JsonProperty("always_use_https")
	private boolean alwaysUseHttps;
	
	@JsonProperty("discoverable_by_email")
	private boolean discoverableByEmail;
	
	@JsonProperty("discoverable_by_mobile_phone")
	private boolean discoverableByMobilePhone;

	@JsonProperty("display_sensitive_media")
	private boolean displaySensitiveMedia;

	@JsonProperty("geo_enabled")
	private boolean geoEnabled;
	
	@JsonProperty("language")
	private String language;
	
	@JsonProperty("protected")
	private boolean isProtected;
	
	@JsonProperty("screen_name")
	private String screenName;
	
	@JsonProperty("use_cookie_personalization")
	private boolean useCookiePersonalization;
	
	@JsonProperty("sleep_time")
	private SleepTime sleepTime;
	
	@JsonProperty("time_zone")
	private TimeZone timeZone;

	@JsonProperty("trend_location")
	private List<TrendLocation> trendLocation;

	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class SleepTimeMixin {
		@JsonProperty("enabled")
		private boolean enabled;
		
		@JsonProperty("start_time")
		private Integer startTime;

		@JsonProperty("end_time")
		private Integer endTime;
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class TimeZoneMixin {
		@JsonProperty("name")
		private String name;

		@JsonProperty("tzinfo_name")
		private String tzInfoName;

		@JsonProperty("utc_offset")
		private int utcOffset;
	}
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public static class TrendLocationMixin {
		@JsonProperty("country")
		private String country;

		@JsonProperty("countryCode")
		private String countryCode;

		@JsonProperty("name")
		private String name;

		@JsonProperty("parentid")
		private long parentId;
		
		@JsonProperty("url")
		private String url;

		@JsonProperty("woeid")
		private long whereOnEarthID;
	}

}
