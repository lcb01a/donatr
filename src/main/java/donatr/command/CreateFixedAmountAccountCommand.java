package donatr.command;

import io.resx.core.command.Command;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

import static donatr.Constants.CREATE_FIXEDAMOUNTACCOUNT_COMMAND_ADDRESS;

@Getter
@Setter
public class CreateFixedAmountAccountCommand extends Command {
	private String id;
	private String name;
	private BigDecimal amount;

	public CreateFixedAmountAccountCommand() {
		super(CREATE_FIXEDAMOUNTACCOUNT_COMMAND_ADDRESS);
	}
}
