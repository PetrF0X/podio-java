package com.podio.filter;

import org.joda.time.LocalDate;

public class PodioDateInterval {
	
	private final PodioDate fromDate;
	
	private final PodioDate toDate;

	public PodioDateInterval(PodioDate fromDate, PodioDate toDate) {
		super();
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	public Object serialize() {
            
            if (fromDate instanceof AbsolutePodioDate || toDate instanceof AbsolutePodioDate) {
                PodioDateIntervalFilter values = new PodioDateIntervalFilter(
                        fromDate == null ? null : ((AbsolutePodioDate) fromDate).getDate(),
                        toDate == null ? null : ((AbsolutePodioDate) toDate).getDate());
                return values;
            } 
            
		String result = "";
		if (fromDate != null) {
			result += fromDate.serialize();
		}
		result += "-";
		if (toDate != null) {
			result += toDate.serialize();
		}
		return result;
	}
	
	public static final PodioDateInterval absolute(LocalDate fromDate, LocalDate toDate) {
		return new PodioDateInterval(fromDate == null ? null : new AbsolutePodioDate(fromDate),
                        toDate == null ? null : new AbsolutePodioDate(toDate));
	}
        
        public class PodioDateIntervalFilter {
            private final LocalDate from;
            private final LocalDate to;

        public PodioDateIntervalFilter(LocalDate from, LocalDate to) {
            this.from = from;
            this.to = to;
        }

        public LocalDate getFrom() {
            return from;
        }

        public LocalDate getTo() {
            return to;
        }
            
            
            
        }

}
