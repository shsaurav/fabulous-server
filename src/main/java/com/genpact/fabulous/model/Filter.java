package com.genpact.fabulous.model;

import javax.annotation.Generated;


public class Filter {

	private String name;
	private FilterType type;

	
	private Filter(Builder builder) {
		this.name = builder.name;
		this.type = builder.type;
	}
	public String getName() {
		return name;
	}
	
	public FilterType getType() {
		return type;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static final class Builder {
		private String name;
		private FilterType type;

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder type(FilterType type) {
			this.type = type;
			return this;
		}
		public Filter build() {
			return new Filter(this);
		}
	}
}
