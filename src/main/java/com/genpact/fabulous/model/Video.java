package com.genpact.fabulous.model;

import java.util.List;
import java.util.Collections;

public class Video {

	private String url;
	private String description;
	private List<String> filters;
	private String creator;

	private Video(Builder builder) {
		this.url = builder.url;
		this.description = builder.description;
		this.filters = builder.filters;
		this.creator = builder.creator;
	}
	
	public String getUrl() {
		return url;
	}
	public String getDescription() {
		return description;
	}
	public List<String> getFilters() {
		return filters;
	}
	public String getCreator() {
		return creator;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static final class Builder {
		private String url;
		private String description;
		private List<String> filters = Collections.emptyList();
		private String creator;

		public Builder url(String url) {
			this.url = url;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder withFilters(List<String> filters) {
			this.filters = filters;
			return this;
		}

		public Builder creator(String creator) {
			this.creator = creator;
			return this;
		}

		public Video build() {
			return new Video(this);
		}
	}
}
