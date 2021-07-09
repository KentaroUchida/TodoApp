package jp.kobespiral.KentaroUchida.todo.entity;//適宜変えること
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member {
    @Id
    String mid;   //メンバーID
    String name;  //氏名
}