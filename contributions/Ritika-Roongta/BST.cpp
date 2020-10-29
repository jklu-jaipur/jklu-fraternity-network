#include<stdio.h>
#include<malloc.h>
#include<stdio.h>
struct tree {
	int info;
	struct tree *left;
	struct tree *right;
};
struct tree *insert(struct tree *,int);
void inorder(struct tree *);
void postorder(struct tree *);
void preorder(struct tree *);
struct tree *delet(struct tree *,int);
struct tree *search(struct tree *);
int main(void) {
	struct tree *root;
	int choice, item,item_no;
	root = NULL;

	do {
		do {
			printf("\n \t 1. Insert element  ");
			printf("\n\t 2. Delete element ");
			printf("\n\t 3. Inorder traversal");
			printf("\n\t 4. Postorder traversal");
			printf("\n\t 5. Preorder traversal");
			printf("\n\t 6. Search and replace ");
			printf("\n\t 7. Exit ");
			printf("\n\t select option : ");
			scanf(" %d",&choice);
			if(choice<1 || choice>7)
			      printf("\n Invalid option choosen - try again");
		}
		while (choice<1 || choice>7);
		switch(choice) {
			case 1:
				   printf("\n Enter new element: ");
			scanf("%d", &item);
			root= insert(root,item);
			printf("\n root is %d",root->info);
			printf("\n Inorder traversal is : ");
			inorder(root);
			break;
			case 2:
				  printf("\n element to be deleted : ");
			scanf(" %d",&item_no);
			root=delet(root,item_no);
			inorder(root);
			break;
			case 3:
				  printf("\n Inorder traversal is : ");
			inorder(root);
			break;
			case 4:
				  printf("\n Postorder traversal is : ");
			postorder(root);
			break;
			case 5:
				  printf("\n Preorder traversal is : ");
			preorder(root);
			break;
			case 6:
				  printf("\n Search and replace an element: ");
			root=search(root);
			break;
			default:
				   printf("\n End of program ");
		}
		
	}
	while(choice !=7);
	return(0);
}
struct tree *insert(struct tree *root, int x) {
	if(!root) {
		root=(struct tree*)malloc(sizeof(struct tree));
		root->info = x;
		root->left = NULL;
		root->right = NULL;
		return(root);
	}
	if(root->info > x)
	     root->left = insert(root->left,x); else {
		if(root->info < x)
			root->right = insert(root->right,x);
	}
	return(root);
}
void inorder(struct tree *root) {
	if(root != NULL) {
		inorder(root->left);
		printf(" %d",root->info);
		inorder(root->right);
	}
	return;
}
void postorder(struct tree *root) {
	if(root != NULL) {
		postorder(root->left);
		postorder(root->right);
		printf(" %d",root->info);
	}
	return;
}
void preorder(struct tree *root) {
	if(root != NULL) {
		printf(" %d",root->info);
		preorder(root->left);
		preorder(root->right);
	}
	return;
}

struct tree *delet(struct tree *ptr,int x) {
	struct tree *p1,*p2;
	if(!ptr) {
		printf("\n not found ");
		return(ptr);
	} else {
		if(ptr->info < x) {
			ptr->right = delet(ptr->right,x);
			
		} else if (ptr->info >x) {
			ptr->left=delet(ptr->left,x);
			return ptr;
		} else                     
		 {
			if(ptr->info == x)    
		 {
				if(ptr->left == ptr->right) 
				{
					free(ptr);
					return(NULL);
				} else if(ptr->left==NULL)  
		 {
					p1=ptr->right;
					free(ptr);
					return p1;
				} else if(ptr->right==NULL)   
			 {
					p1=ptr->left;
					free(ptr);
					return p1;
				} else {
					p1=ptr->right;
					p2=ptr->right;
					while(p1->left != NULL)
						    p1=p1->left;
					p1->left=ptr->left;
					free(ptr);
					return p2;
				}
			}
	
		}

	}
	return(ptr);
}

struct tree *search(struct tree *root) {
	int no,i,ino;
	struct tree *ptr;
	ptr=root;
	printf("\n element to be searched :");
	scanf(" %d",&no);
	fflush(stdin);
	while(ptr) {
		if(no>ptr->info)
		     ptr=ptr->right; else if(no<ptr->info)
		     ptr=ptr->left; else
		     break;
	}
	if(ptr) {
		printf("\n Element %d found and is = %d",no,ptr->info);
		printf("\n to replace it, press 1 : ");
		scanf(" %d",&i);
		if(i==1) {
			printf("\n Enter new element :");
			scanf(" %d",&ino);
			ptr->info=ino;
		} else
		    printf("\n\t contiue");
	} else
	   printf("\n Element %d does not found",no);
	return(root);
}
