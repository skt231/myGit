package utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieManager {
	//명시된 이름,값,유지기간 조건으로 새로운 생성한다.
	public static void makeCookie(HttpServletResponse response,String cName,String cValue,int cTime) {
			Cookie cookie=new Cookie(cName,cValue);	//쿠키생성
			cookie.setPath("/");	//경로설정
			cookie.setMaxAge(cTime); 	//유지기간 설정
			response.addCookie(cookie);	//응답 객체에 추가
	}
	
	//명시한 이름의 쿠키를 찾아 그 값을 반환한다.
	public static String readCookie(HttpServletRequest request,String cName) {
		String cookieValue="";	//반환값
		
		Cookie[] cookies=request.getCookies();
		if(cookies != null) {
			for(Cookie c : cookies) {
				String cookieName = c.getName();
				if(cookieName.equals(cName)) {
					cookieValue=c.getValue();	//반환 값 갱신
				}
			}
		}
		return cookieValue;
	}
	
	//명시한 이름의 쿠키를 삭제합니다.
	public static void deleteCookie(HttpServletResponse response,String cName) {
		makeCookie(response,cName,"",0);
	}
}
