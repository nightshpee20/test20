package mappers;

import dao.Post;

public interface PostsMapper {
	public Post selectPostById(int id);
}
