

public class JulianDate {
	private int date;

	public JulianDate(int day, int month, int year) {
		date = gregToJulian(day, month, year);
	}
	public JulianDate(int julianDate){
		this.date = julianDate;
	}

	private int gregToJulian(int day, int month, int year) {
		int a = (14 - month) / 12;
		int y = year + 4800 - a;
		int m = month + 12 * a - 3;
		int jdn = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
		return jdn;
	}

	public int daysDifference(int day, int month, int year) {
		int date = gregToJulian(day, month, year);
		return date - this.date;
	}

	public int getJDate() {
		return date;
	}

	public int getGregDay()
	{
		int y = 4716;
		int j = 1401;
		int m = 2;
		int n = 12;
		int r = 4;
		int p = 1461;
		int v = 3;
		int u = 5;
		int s = 153;
		int w = 2;
		int b = 274277;
		int c = -38;
		int f = date + j + (((4 * date + b) / 146097) * 3) / 4 + c;
		int e = r * f + v;
		int g = (e % p) / r;
		int h = u * g + w;
		return (h % s) / u + 1;

	}
	
	public int getGregMonth()
	{
		int y = 4716;
		int j = 1401;
		int m = 2;
		int n = 12;
		int r = 4;
		int p = 1461;
		int v = 3;
		int u = 5;
		int s = 153;
		int w = 2;
		int b = 274277;
		int c = -38;
		int f = date + j + (((4 * date + b) / 146097) * 3) / 4 + c;
		int e = r * f + v;
		int g = (e % p) / r;
		int h = u * g + w;
		return (h / s + m)% n + 1;
	}
	public int getGregYear()
	{
		int y = 4716;
		int j = 1401;
		int m = 2;
		int n = 12;
		int r = 4;
		int p = 1461;
		int v = 3;
		int u = 5;
		int s = 153;
		int w = 2;
		int b = 274277;
		int c = -38;
		int f = date + j + (((4 * date + b) / 146097) * 3) / 4 + c;
		int e = r * f + v;
		int g = (e % p) / r;
		int h = u * g + w;
		int month = (h / s + m)% n + 1;
		return (e / p) - y + (n + m - month) / n;
	}
	public String checkWeekDay() {
		String[] weekDays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		int weekDay = (date % 7);
		
		
			return weekDays[weekDay];
	}
}
