package texas.sbq.tour.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import lombok.Data;
import texas.sbq.tour.mapper.MapMapper;

@Data
@Component
public class MapProxy {
	@Autowired MapMapper mapMapper;
	
	public List<String> placeList() {
		List<String> place = Arrays.asList("프레이저 플레이스 센트럴",
				"포 포인츠 바이 쉐라톤",
				"베뉴지 호텔 서울",
				"호스텔코리아 창덕궁",
				"명동 멀린 호텔",
				"명동 바이 롯데",
				"그랜드 앰배서더 서울",
				"서울 신라 호텔",
				"써미트 호텔 동대문",
				"호텔 그레이스리 서울",
				"소테츠 호텔즈 더 스프라지르",
				"이태원 에이원호텔",
				"임피리얼 팰리스 부티크 호텔",
				"크라운 관광 호텔",
				"호텔 더 디자이너스",
				"나인트리 프리미어 호텔",
				"명가의뜰",
				"불고기브라더스 서울역사점",
				"계림식당",
				"황소고집",
				"필동면옥",
				"대림정",
				"명동교자 본점",
				"명동피자",
				"돈돈돈까스",
				"평안도 족발집",
				"동화반점",
				"에베레스트레스토랑",
				"약수순대국",
				"호박식당",
				"오레노",
				"강원정",
				"한국의집",
				"블루스퀘어",
				"숭례문(남대문)",
				"N서울타워",
				"명동대성당",
				"서울숲",
				"국립극장",
				"전쟁기념관",
				"종묘",
				"탑골공원",
				"창덕궁",
				"경복궁",
				"청계천",
				"경리단길",
				"매봉산 팔각정",
				"효창공원",
				"백범김구기념관",
				"광장시장");
		
		return place;
	}
	public List<String> latitudeList() {
		List<String> latitude = Arrays.asList("126.969861/37.5625981",
				"126.972763/37.5508409",
				"126.990822/37.5687196",
				"126.990289/37.5761166",
				"126.999040/37.5626203",
				"126.986963/37.5613490",
				"127.002379/37.5601606",
				"127.005932/37.5566106",
				"127.006861/37.5622328",
				"126.976947/37.5615817",
				"127.007721/37.5646924",
				"126.991607/37.5340224",
				"126.998215/37.5352301",
				"126.990793/37.5314275",
				"126.971577/37.5455428",
				"126.990936/37.5642416",
				
				"126.970466/37.5491014",
				"126.971042/37.5523812",
				"126.994478/37.5701434",
				"126.986124/37.5685659",
				"126.996901/37.5603768",
				"126.994592/37.5615660",
				"126.985741/37.5625562",
				"126.985854/37.5620427",
				"127.005197/37.5597281",
				"127.006034/37.5602506",
				"127.008163/37.5677287",
				"127.007302/37.5670170",
				"127.010017/37.5529974",
				"127.012304/37.5572950",
				"126.994866/37.5351489",
				"126.967811/37.5404511",
				
				"126.994603/37.5601875",
				"127.002627/37.5406902",
				"126.975317/37.5599595",
				"126.988923/37.5492850",
				"126.986827/37.5632772",
				"127.040535/37.5451436",
				"127.000025/37.5528716",
				"126.977023/37.5362457",
				"126.994840/37.5731167",
				"126.988331/37.5711790",
				"126.991295/37.5827570",
				"126.976952/37.5806736",
				"126.978687/37.5692675",
				"126.992365/37.5399870",
				"127.019736/37.5412834",
				"126.963237/37.5455404",
				"126.959096/37.5445659",
				"126.998689/37.5702697");
		
		return latitude;
	}
	 public List<Maps> mapDB() {
		 Maps maps= null;
		 List<Maps> mapList = new ArrayList<>();
		 for(int i = 0 ; i<placeList().size();i++) {
			 maps = new Maps(placeList().get(i), latitudeList().get(i));
			 mapList.add(maps);
			
		 }
		 
	  return mapList;
	 }
		
		@Transactional
		public void insertMapDB() {
			 List<Maps> mList = mapDB();
			for(int i=0;i<mList.size();i++) {
				mapMapper.insertMap(mList.get(i));
			}
		
		}
	 
	
}
