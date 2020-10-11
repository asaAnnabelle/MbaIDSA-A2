package html;

import assignment.Course;
import assignment.Department;
import assignment.Program;
import assignment.Semester;
import assignment.Specialisation;
import assignment.Studylevel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;

@SuppressWarnings("all")
public class HtmlGenerator {
  public ArrayList<String> idList = new ArrayList<String>();
  
  public String generateHtml(final Department department) {
    StringBuilder _stringBuilder = new StringBuilder();
    return this.generateHtml(department, _stringBuilder);
  }
  
  public String generateHtml(final Department department, final StringBuilder builder) {
    String _xblockexpression = null;
    {
      this.generateHtmlStart("Department", builder);
      int _size = department.getPrograms().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          if (((i).intValue() > 0)) {
            HtmlGenerator.operator_doubleLessThan(builder, "<br/><hr/><br/>");
          }
          this.generateScript(department.getPrograms().get((i).intValue()).getSemseters(), builder);
          this.generatePrograms(department.getPrograms().get((i).intValue()), builder);
        }
      }
      this.generateHtmlEnd(builder);
      this.generateStyle(builder);
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  public static StringBuilder operator_doubleLessThan(final StringBuilder stringBuilder, final Object o) {
    return stringBuilder.append(o);
  }
  
  public void generateStyle(final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("* {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("font-family: arial, sans-serif;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("h1, h2, h3 {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-bottom: 20px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("margin-left : 20px;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
  }
  
  public void generateScript(final EList<Semester> semesters, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<script type=\"text/javascript\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function checkYears(start, end, selected){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// parsing all the input to Integers.");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let start_int = parseInt(start)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let end_int = parseInt(end)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("let selected_int = parseInt(selected)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("console.log(\"start \" , start_int)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("console.log(\"end \", end_int)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("console.log(\"start and end stringz\", start, end)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("console.log(\"selected int :  \", selected)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(end_int === 0){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("console.log(\"inside end-int == 0\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(selected_int >= start_int) return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}else{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("console.log(\"endint is not 0\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(selected_int >= start_int && selected_int < end_int) return true;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("console.log(\"returning false! at \",start, end)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function onClickyear(selected){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("var divs = document.getElementsByClassName(\"semester\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// setting all semester to none, so they are removed. ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (var i = 0; i < divs.length; i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("divs[i].style.display = \'none\';");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(this.idList, "\t");
    _builder.append(".forEach(id => {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("console.log(id.toString())");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const start = id.toString().slice(1,5) // here we are fetching the start year. ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const end = id.toString().slice(5); // here we are fetching the end year");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// an example of this is 20202021 where the start year is 2020 and end is 2021");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// OBS! the end year might not exist!");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("const is_accepted = checkYears(start, end, selected.value) // checked if the year selected is in this id.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// if the id from the idlist is accepted then we will show this id/semester.");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(is_accepted) document.getElementById(id.toString()).style.display = \'block\';");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</script>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
  }
  
  public void generateHtmlStart(final String title, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>Department</title>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<meta http-equiv=\"content-type\" content=\"text/html; charset=\"UTF-8\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
  }
  
  public void generateHtmlEnd(final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
  }
  
  protected void _generatePrograms(final Program program, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h1 id=2020></h1>");
    _builder.newLine();
    _builder.append("<div class=\"row\" style=\"text-align:center;\">");
    _builder.newLine();
    _builder.append("<h1>");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("<h1> ");
    String _code = program.getCode();
    _builder.append(_code);
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int _size = program.getSemseters().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      this.generateStudyplanYear(program, builder);
    }
    int _size_1 = program.getSemseters().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size_1, true);
    for (final Integer o : _doubleDotLessThan) {
      Specialisation _specialisation = program.getSemseters().get((o).intValue()).getSpecialisation();
      boolean _tripleEquals = (_specialisation == null);
      if (_tripleEquals) {
        this.generateSemester(program.getSemseters().get((o).intValue()), builder);
      }
    }
    EList<Specialisation> _specialisation_1 = program.getSpecialisation();
    boolean _tripleNotEquals = (_specialisation_1 != null);
    if (_tripleNotEquals) {
      HtmlGenerator.operator_doubleLessThan(builder, "<br/><hr/><br/>");
    }
    int _size_2 = program.getSpecialisation().size();
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size_2, true);
    for (final Integer i : _doubleDotLessThan_1) {
      int _endyear = program.getSpecialisation().get((i).intValue()).getEndyear();
      boolean _tripleEquals_1 = (_endyear == 0);
      if (_tripleEquals_1) {
        this.generateSpecialisation(program.getSpecialisation().get((i).intValue()), builder);
      }
    }
  }
  
  protected void _generateSpecialisation(final Specialisation specialisation, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h2>");
    String _name = specialisation.getName();
    _builder.append(_name);
    _builder.append("</h2>");
    _builder.newLineIfNotEmpty();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int _size = specialisation.getSemester().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      this.generateSemesterS(specialisation.getSemester().get((i).intValue()), builder);
    }
  }
  
  public void generateTableStart(final StringBuilder builder, final String... headers) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table class=\"table table-striped table-responsive mb-8 mt-0\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<tr>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    final Consumer<String> _function = new Consumer<String>() {
      public void accept(final String it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<th>");
        _builder.append(it);
        _builder.append("</th>");
        HtmlGenerator.operator_doubleLessThan(builder, _builder);
      }
    };
    ((List<String>)Conversions.doWrapArray(headers)).forEach(_function);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t");
    _builder_1.append("</tr>");
    _builder_1.newLine();
    _builder_1.append("</thead>");
    _builder_1.newLine();
    _builder_1.append("<tbody>");
    _builder_1.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_1);
  }
  
  public void generateSpecialisationTypes(final Program program, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<select id=\"specialisation\" name=\"specialisations\" ");
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int _size = program.getSpecialisation().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      int _endyear = program.getSpecialisation().get((i).intValue()).getEndyear();
      boolean _equals = (_endyear == 0);
      if (_equals) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<option value=\"");
        String _name = program.getSpecialisation().get((i).intValue()).getName();
        _builder_1.append(_name);
        _builder_1.append("\">");
        String _name_1 = program.getSpecialisation().get((i).intValue()).getName();
        _builder_1.append(_name_1);
        _builder_1.append("</option>");
        _builder_1.newLineIfNotEmpty();
        HtmlGenerator.operator_doubleLessThan(builder, _builder_1);
      }
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("</select>");
    HtmlGenerator.operator_doubleLessThan(builder, _builder_2);
  }
  
  public void generateStudyplanYear(final Program program, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("<h4 style=\"padding-right:20px;\">Kull  </h4>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("<select class=\"custom-select float-right\" id=\"yearSelection\"\" onchange=\"onClickyear(this)\">");
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int start = 2020;
    int end = 2020;
    int _size = program.getSemseters().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      Specialisation _specialisation = program.getSemseters().get((i).intValue()).getSpecialisation();
      boolean _tripleEquals = (_specialisation == null);
      if (_tripleEquals) {
        int _startyear = program.getSemseters().get((i).intValue()).getStartyear();
        boolean _lessThan = (_startyear < start);
        if (_lessThan) {
          start = program.getSemseters().get((i).intValue()).getStartyear();
        }
      }
    }
    ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, ((end - start) + 1), true);
    for (final Integer o : _doubleDotLessThan_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<option value=\"");
      _builder_1.append((start + (o).intValue()));
      _builder_1.append("\">");
      _builder_1.append((start + (o).intValue()));
      _builder_1.append(" </option>");
      _builder_1.newLineIfNotEmpty();
      HtmlGenerator.operator_doubleLessThan(builder, _builder_1);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("</select>");
    _builder_2.newLine();
    _builder_2.append("</div>");
    _builder_2.newLine();
    _builder_2.append("</div>");
    _builder_2.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_2);
  }
  
  public boolean checkSemesterYear(final Semester s1, final int year) {
    if (((s1.getStartyear() < year) && (s1.getEndyear() >= year))) {
      return true;
    }
    return false;
  }
  
  protected void _generateSemester(final Semester semester, final StringBuilder builder) {
    this.idList.add(Integer.toString(semester.getSemesternr()).concat(Integer.toString(semester.getStartyear()).concat(Integer.toString(semester.getEndyear()))));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div id=\"");
    int _semesternr = semester.getSemesternr();
    _builder.append(_semesternr);
    int _startyear = semester.getStartyear();
    _builder.append(_startyear);
    int _endyear = semester.getEndyear();
    _builder.append(_endyear);
    _builder.append("\" class=\"semester\">");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int _semesternr_1 = semester.getSemesternr();
    int _modulo = (_semesternr_1 % 2);
    boolean _equals = (_modulo == 0);
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div class=\"row\">");
      _builder_1.newLine();
      _builder_1.append("<h5 style=\"color:gray;padding-right:20px;\">Vår </h5>");
      _builder_1.newLine();
      HtmlGenerator.operator_doubleLessThan(builder, _builder_1);
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<div class=\"row\">");
      _builder_2.newLine();
      _builder_2.append("<h5 style=\"color:gray;padding-right:20px;\">Høst </h5>");
      _builder_2.newLine();
      HtmlGenerator.operator_doubleLessThan(builder, _builder_2);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<h5> Obligatoriske og valgbare emner - ");
    int _semesternr_2 = semester.getSemesternr();
    _builder_3.append(_semesternr_2);
    _builder_3.append(". semester</h5>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("</div>");
    _builder_3.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_3);
    this.generateTableStart(builder, "Code", "Navn", "Credits", "Studielevel", "Status");
    int _size = semester.getMandatoryCourse().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final Consumer<Course> _function = new Consumer<Course>() {
        public void accept(final Course it) {
          HtmlGenerator.this.generateCourse(it, "mandatory course", builder);
        }
      };
      semester.getMandatoryCourse().forEach(_function);
    }
    int _size_1 = semester.getSelectableCourse().size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      final Consumer<Course> _function_1 = new Consumer<Course>() {
        public void accept(final Course it) {
          HtmlGenerator.this.generateCourse(it, "selectable course", builder);
        }
      };
      semester.getSelectableCourse().forEach(_function_1);
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("</tbody>");
    _builder_4.newLine();
    _builder_4.append("</table>");
    _builder_4.newLine();
    _builder_4.append("</div>");
    _builder_4.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_4);
  }
  
  protected void _generateSemesterS(final Semester semester, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
    int _semesternr = semester.getSemesternr();
    int _modulo = (_semesternr % 2);
    boolean _equals = (_modulo == 0);
    if (_equals) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<div class=\"row\">");
      _builder_1.newLine();
      _builder_1.append("<h5 style=\"color:gray;padding-right:20px;\">Vår </h5>");
      _builder_1.newLine();
      HtmlGenerator.operator_doubleLessThan(builder, _builder_1);
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("<div class=\"row\">");
      _builder_2.newLine();
      _builder_2.append("<h5 style=\"color:gray;padding-right:20px;\">Høst </h5>");
      _builder_2.newLine();
      HtmlGenerator.operator_doubleLessThan(builder, _builder_2);
    }
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("<h5> Obligatoriske og valgbare emner - ");
    int _semesternr_1 = semester.getSemesternr();
    _builder_3.append(_semesternr_1);
    _builder_3.append(". semester</h5>");
    _builder_3.newLineIfNotEmpty();
    _builder_3.append("</div>");
    _builder_3.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_3);
    this.generateTableStart(builder, "Code", "Navn", "Credits", "Studielevel", "Status");
    int _size = semester.getMandatoryCourse().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final Consumer<Course> _function = new Consumer<Course>() {
        public void accept(final Course it) {
          HtmlGenerator.this.generateCourse(it, "mandatory course", builder);
        }
      };
      semester.getMandatoryCourse().forEach(_function);
    }
    int _size_1 = semester.getSelectableCourse().size();
    boolean _greaterThan_1 = (_size_1 > 0);
    if (_greaterThan_1) {
      final Consumer<Course> _function_1 = new Consumer<Course>() {
        public void accept(final Course it) {
          HtmlGenerator.this.generateCourse(it, "selectable course", builder);
        }
      };
      semester.getSelectableCourse().forEach(_function_1);
    }
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("</tbody>");
    _builder_4.newLine();
    _builder_4.append("</table>");
    _builder_4.newLine();
    _builder_4.append("</div>");
    _builder_4.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder_4);
  }
  
  protected void _generateCourse(final Course course, final String type, final StringBuilder builder) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td style=\"color:blue;\">");
    String _code = course.getCode();
    _builder.append(_code);
    _builder.append("</td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td>");
    String _name = course.getName();
    _builder.append(_name);
    _builder.append("</td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td>");
    double _credits = course.getCredits();
    _builder.append(_credits);
    _builder.append("</td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td>");
    Studylevel _studylevel = course.getStudylevel();
    _builder.append(_studylevel);
    _builder.append("</td>");
    _builder.newLineIfNotEmpty();
    _builder.append("<td>");
    _builder.append(type);
    _builder.append("</td>");
    _builder.newLineIfNotEmpty();
    _builder.append("</tr>");
    _builder.newLine();
    HtmlGenerator.operator_doubleLessThan(builder, _builder);
  }
  
  public void generatePrograms(final Program program, final StringBuilder builder) {
    _generatePrograms(program, builder);
    return;
  }
  
  public void generateSpecialisation(final Specialisation specialisation, final StringBuilder builder) {
    _generateSpecialisation(specialisation, builder);
    return;
  }
  
  public void generateSemester(final Semester semester, final StringBuilder builder) {
    _generateSemester(semester, builder);
    return;
  }
  
  public void generateSemesterS(final Semester semester, final StringBuilder builder) {
    _generateSemesterS(semester, builder);
    return;
  }
  
  public void generateCourse(final Course course, final String type, final StringBuilder builder) {
    _generateCourse(course, type, builder);
    return;
  }
}
