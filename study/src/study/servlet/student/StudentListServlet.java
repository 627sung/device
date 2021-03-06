package study.servlet.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import study.beans.student.StudentDao;
import study.beans.student.StudentDto;

@WebServlet(urlPatterns = "/student/list.do")
public class StudentListServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 입력 없음
			// - student_name 이 있으면 /student/search.do로 리다이렉트
			// - student_name 없으면 계속 진행
			String student_name = req.getParameter("student_name");
			if (student_name != null) {// 파라미터가 존재한다면
				// 상대 경로 : 현재 위치를 기준으로 계산하는 경로
				resp.sendRedirect("search.do?student_name=" + student_name);

				// 절대 경로 : 절대적인 위치를 나타내는 경로
//      resp.sendRedirect("http://localhost:8080/study/student/search.do);
				return; // 반환 종료
			}

			// 처리
			StudentDao sdao = new StudentDao();
			List<StudentDto> list = sdao.getList();

			// 출력
			resp.setContentType("text/plain; charset = UTF-8");
			resp.getWriter().println(list.size() + "명의 명단이 있습니다.");
			for (StudentDto sdto : list) {
				resp.getWriter().println(sdto.getStudent_name());
			}

		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}

	}
}