package texas.sbq.tour.mapper;

import java.util.HashMap;
import java.util.List;

import texas.sbq.tour.tour.Tour;
import texas.sbq.tour.tour.TourProxy;


public interface TourMapper {

	public void insertTour(Tour param);
	public int countHeart();
	public void createTour(HashMap<String, String> paramMap);
	public void dropTour(HashMap<String, String> paramMap);
	public void truncateTour(HashMap<String, String> paramMap);
	public List<Tour> tourList(TourProxy pxy);
	public int countTourList();
	public Tour selectTourByPlace(String place);
	public Tour selectTourRandom();
	
}
