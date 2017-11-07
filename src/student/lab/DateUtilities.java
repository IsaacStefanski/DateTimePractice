package student.lab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.text.DateFormatter;

/**
 *
 * @author Isaac
 */
public class DateUtilities {
    /**
     * @return the current date as yyyy-mm-dd.
     */
    public final LocalDate today(){
        return LocalDate.now();
    }
    
    /**
     * @return the current date and time as yyyy-mm-ddThh:mm:ss.
     */
    public final LocalDateTime now(){
        return LocalDateTime.now();
    }
    
    /**
     * Format a <code>LocalDate</code> according to the pattern passed in
     *
     * @param date - a <code>LocalDate</code> object
     * @param pattern - a <code>String</code> object
     * @return a date formatted according to the date pattern passed in
     * @throws IllegalArgumentException if date or pattern is null
     */
    public final String format(LocalDate date, String pattern) throws IllegalArgumentException{
        if(date == null || pattern.isEmpty()){
            throw new IllegalArgumentException("Date and pattern cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }
    
    /**
     * Format a <code>LocalDateTime</code> according to the pattern passed in
     *
     * @param dateTime - a <code>LocalDateTime</code> object
     * @param pattern - a <code>String</code> object
     * @return a date formatted according to the date pattern passed in
     * @throws IllegalArgumentException if date or pattern is null
     */
    public final String format(LocalDateTime dateTime, String pattern) throws IllegalArgumentException{
        if(dateTime == null || pattern.isEmpty()){
            throw new IllegalArgumentException("Date and pattern cannot be null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(dateTime);
    }
    
    /**
     * Format a <code>LocalDate</code> from a <code>String</code>
     *
     * @param inputDate - a <code>LocalDate</code> object
     * @param pattern - a <code>String</code> object
     * @return a date formatted according to the date pattern passed in
     * @throws IllegalArgumentException if date string is null
     */
    public final LocalDate toLocalDate(String inputDate, String pattern) throws IllegalArgumentException{
        if(inputDate == null || inputDate.isEmpty() || inputDate.equals("-") || inputDate.equals(" ")){
            throw new IllegalArgumentException("Input date string is invalid");
        }
        LocalDate localDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern(pattern));
        return localDate;
    }
    
    /**
     * Format a <code>LocalDateTime</code> from a <code>String</code>
     *
     * @param inputDateTime - a <code>LocalDate</code> object
     * @param pattern - a <code>String</code> object
     * @return a date formatted according to the date pattern passed in
     * @throws IllegalArgumentException if date string is null
     */
    public final LocalDateTime toLocalDateTime(String inputDateTime, String pattern) throws IllegalArgumentException{
        if(inputDateTime == null || inputDateTime.isEmpty() || inputDateTime.equals("-") || inputDateTime.equals(" ")){
            throw new IllegalArgumentException("Input date string is invalid");
        }
        LocalDateTime localDateTime = LocalDateTime.parse(inputDateTime, DateTimeFormatter.ofPattern(pattern));
        return localDateTime;
    }
    
    /**
     * @param startDate - a <code>LocalDate</code> object
     * @param endDate - a <code>LocalDate</code> object
     * @return duration between start and end dates
     * @throws IllegalArgumentException if any date is null
     */
    public final Duration findDuration(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start and end dates cannot be null");
        }
        Duration diff = Duration.between(startDate, endDate);
        return diff;
    }
    
    /**
     * @param startDate - a <code>LocalDate</code> object
     * @param endDate - a <code>LocalDate</code> object
     * @return duration in hours between start and end dates
     * @throws IllegalArgumentException if any date is null
     */
    public final long findHoursBetween(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start and end dates cannot be null");
        }
        Duration diff = Duration.between(startDate, endDate);
        long hours = diff.toHours();
        return hours;
    }
    
    /**
     * @param startDate - a <code>LocalDate</code> object
     * @param endDate - a <code>LocalDate</code> object
     * @return duration in hours between start and end dates
     * @throws IllegalArgumentException if any date is null
     */
    public final long findDaysBetween(LocalDate startDate, LocalDate endDate) throws IllegalArgumentException{
        if(startDate == null || endDate == null){
            throw new IllegalArgumentException("Start and end dates cannot be null");
        }
        Duration diff = Duration.between(startDate, endDate);
        long days = diff.toDays();
        return days;
    }
}