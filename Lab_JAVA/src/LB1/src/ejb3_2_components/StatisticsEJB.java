@Stateless
public class StatisticsEJB {
@Schedule(dayOfMonth="1", hour ="4", minute="25")
public void statisticsItemsSold() { }
@Schedules({
@Schedule(hour = "1"),
@Schedule(hour = "10", dayOfWeek = "Wed")
})
public void generateReport() { ... }
    @Schedule(minute = "*/8", hour = "*", persistent = false)
public void refreshCache() { }
}
