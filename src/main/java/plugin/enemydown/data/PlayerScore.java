package plugin.enemydown.data;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

/**
 * EnemyDownのゲームを実行する際のスコア情報を扱うオブジェクト
 * プレイヤー名、合計点数、日時などの情報をもつ
 */
@Getter
@Setter
public class PlayerScore {
  private String playerName;
  private int score;
}