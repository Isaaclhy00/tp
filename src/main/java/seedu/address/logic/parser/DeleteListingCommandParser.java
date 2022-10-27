package seedu.address.logic.parser;

import seedu.address.logic.commands.DeleteListingCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.listing.ListingId;

/**
 * Parses input arguments and creates a new DeleteCommand object
 */
public class DeleteListingCommandParser implements Parser<DeleteListingCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the DeleteListingCommand
     * and returns a DeleteListingCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteListingCommand parse(String args) throws ParseException {
        ListingId id = ParserUtil.parseListingId(args.trim());
        return new DeleteListingCommand(id);
    }

}
